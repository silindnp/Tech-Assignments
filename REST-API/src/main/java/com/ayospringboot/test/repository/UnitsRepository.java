package com.ayospringboot.test.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Repository;


import com.ayospringboot.test.dto.ConvertedUnit;
import com.ayospringboot.test.dto.UnitsModel;
 
@Repository
public class UnitsRepository {
     
    Map<String,Object> UnitsModelMap = new HashMap<String,Object>();
     
    // Return all UnitsModelMap
    public Collection<?> findAll(){
        return UnitsModelMap.values();
    }
 
    // Find the UnitsModel with this id
    public Optional<?> findById(String id) {
        UnitsModel unitsmodel = null;
 
        if (UnitsModelMap.containsKey(id)) unitsmodel = (UnitsModel) UnitsModelMap.get(id);
        return Optional.ofNullable(unitsmodel);
    }
         
    // Save a new UnitsModel   
    public UnitsModel save(UnitsModel unitsmodel) {
        UnitsModelMap.put(unitsmodel.getId(), unitsmodel);
        return unitsmodel;
    }
     
    // Update the UnitsModel with this id
    public Optional<?> update(UnitsModel unitsmodel) {
        UnitsModel currentUnitsModel = (UnitsModel) UnitsModelMap.get(unitsmodel.getId());
 
        if (currentUnitsModel != null) {
            UnitsModelMap.put(unitsmodel.getId(), unitsmodel);
            currentUnitsModel = (UnitsModel) UnitsModelMap.get(unitsmodel.getId());
        }
        return Optional.ofNullable(currentUnitsModel);
    }
     
    // Delete UnitsModel with this id
    public Optional<?> convertUnit(String id, Double unitvalue) {
        ConvertedUnit cunit = new ConvertedUnit();
        Double convtValue = (double)0;
        Long unitnumber = unitvalue.longValue();
        String description = "";
 
        if (UnitsModelMap.containsKey(id)) {
        	switch(id) {
        	case "Cel-Fahr" :
        		unitnumber = (long) Math.round((unitnumber * 9/5) + 32);
        		description = unitvalue.longValue() + " Degrees Celsius = " + unitnumber.toString() + " Fahrenheit";
        		cunit.setId(id);
        		cunit.setDescription(description);
        		break;
        		
        	case "Fahr-Cel" :
        		unitnumber = (long) Math.round((unitvalue - 32) * 5/9);
        		description = unitvalue.longValue() + " Fahrenheit = " + unitnumber.toString() + " Degrees Celsius";
        		cunit.setId(id);
        		cunit.setDescription(description);
        		break;
        		
        	case "km-mile" :
        		convtValue = unitvalue * 0.6214;
        		description = unitvalue + " km = " + convtValue.toString() + " mile";
        		cunit.setId(id);
        		cunit.setDescription(description);
        		break;

        	case "mile-km" :
        		convtValue = unitvalue * 1.6093;
        		description = unitvalue + " mile = " + convtValue.toString() + " km";
        		cunit.setId(id);
        		cunit.setDescription(description);
        		break;

        	case "st-t" :
        		convtValue = unitvalue * 0.9072;
        		description = unitvalue + " short tone = " + convtValue.toString() + " Tones";
        		cunit.setId(id);
        		cunit.setDescription(description);
        		break;

        	case "t-st" :
        		convtValue = unitvalue * 1.1023;
        		description = unitvalue + " Tones = " + convtValue.toString() + " short tone";
        		cunit.setId(id);
        		cunit.setDescription(description);
        		break;

        	case "kg-lb" :
        		convtValue = unitvalue * 2.2046;
        		description = unitvalue + " kg = " + convtValue.toString() + " Pound";
        		cunit.setId(id);
        		cunit.setDescription(description);
        		break;

        	case "lb-kg" :
        		convtValue = unitvalue * 0.4536;
        		description = unitvalue + " Pound = " + convtValue.toString() + " kg";
        		cunit.setId(id);
        		cunit.setDescription(description);
        		break;

        	case "l-gal" :
        		convtValue = unitvalue / 3.7854;
        		description = unitvalue + " Liters = " + convtValue.toString() + " Gallons";
        		cunit.setId(id);
        		cunit.setDescription(description);
        		break;

        	case "gal-l" :
        		convtValue = unitvalue * 3.7854;
        		description = unitvalue + " Gallons = " + convtValue.toString() + " Liters";
        		cunit.setId(id);
        		cunit.setDescription(description);
        		break;
        	}
        	
        }	
        return Optional.ofNullable(cunit);
 
        /*if (currentUnitsModel != null) {
            UnitsModelMap.remove(id);
        }*/
    }
}