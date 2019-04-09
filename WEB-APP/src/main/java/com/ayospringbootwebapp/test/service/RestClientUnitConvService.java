package com.ayospringbootwebapp.test.service; 


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import com.ayospringbootwebapp.test.dto.UnitDto;

//set up the class as a service
@Service
public class RestClientUnitConvService {

    //define a RestTemplate object
    private final RestTemplate restTemplate;

    //web service resources endpoints
    private final String GET_ALL_URL = "http://localhost:8086/convertunits/";
    private final String GET_URL_BY_ID = "http://localhost:8086/convertunits/";

    //define an argument constructor, pass in the RestTemplate object
    //and Autowire it
    @Autowired
    public RestClientUnitConvService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }
     /**
     * Get all convertable Units
     * @return a list
     */
    public List<UnitDto> findAllUnits(){
        return Arrays.stream(restTemplate.getForObject(GET_ALL_URL,UnitDto[].class)).collect(Collectors.toList());
    }

    /**
     * Convert Unit by id
     * @param unitId and value to convert
     * @return a UnitDto
     */
    public UnitDto convertUnit(String unitId, Double value){
        return restTemplate.getForObject(GET_URL_BY_ID + value + "/" + unitId, UnitDto.class);
    }
    
    public UnitDto findUnitById(String id){
        return restTemplate.getForObject(GET_URL_BY_ID +id, UnitDto.class);
    }
}