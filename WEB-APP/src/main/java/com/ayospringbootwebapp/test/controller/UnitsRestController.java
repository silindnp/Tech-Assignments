package com.ayospringbootwebapp.test.controller; 

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

import com.ayospringbootwebapp.test.dto.UnitDto;
////import com.ayospringbootwebapp.test.entitymodel.UserLogin;
import com.ayospringbootwebapp.test.service.RestClientUnitConvService;
////import com.ayospringbootwebapp.test.service.UserService;

@RestController
public class UnitsRestController {
	
	//define a services constant
    private final RestClientUnitConvService restservice;
    
    /////UserLogin loggedUser = null;

    //Argument contructor of controller, pass in the service
    //and Autowire it
    @Autowired
    public UnitsRestController(RestClientUnitConvService restservice){
       this.restservice = restservice;
    }

    /*@Autowired
    private UserService service;*/
    
    /*UNCOMMENT AUDIT LOGGING WHEN THE DATABSE IS AVAILABLE*/
    
	 @RequestMapping("/onlineconvertunits/convert/{unitvalue}/{id}")
	 public UnitDto convert(@PathVariable Double unitvalue, @PathVariable("id") String id) {
		 //System.out.println("Unit-ID = " + id + "  ---- Value = " + unitvalue);
	    UnitDto udt = new UnitDto();
	    udt = restservice.convertUnit(id,unitvalue);
	    System.out.println("Unit-ID = " + udt.getId() + " , " + udt.getDescription());
////	    service.addUserAuditEntry("Logged-user", "Requesting Unit Conversion");
		//model.addAttribute("unitDto", udt);
	  return udt;
	 }

	 @RequestMapping("/onlineconvertunits/getAllUnits")
	 public List<UnitDto> populateUnitsLookup(Model model) {
		 //System.out.println("Unit-ID = " + id + "  ---- Value = " + unitvalue);
	    UnitDto udt = new UnitDto();
	    List<UnitDto> AllUnits = restservice.findAllUnits();
	    System.out.println("Unit-ID = " + udt.getId() + " , " + udt.getDescription());
////	    service.addUserAuditEntry("Logged-user", "Requesting Unit Conversion");
	  //model.addAttribute("allUnitsDto", AllUnits);
	  return AllUnits;
	 }
	 
	 
}