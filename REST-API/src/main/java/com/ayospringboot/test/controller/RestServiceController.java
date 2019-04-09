package com.ayospringboot.test.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ayospringboot.test.repository.UnitsRepository;
import com.ayospringboot.test.dto.ConvertedUnit;
import com.ayospringboot.test.dto.UnitsModel;
 
@RestController
@RequestMapping("/convertunits")
public class RestServiceController {
	
	private final UnitsRepository repository;
	 
	@Autowired
	public RestServiceController(UnitsRepository repository) {
	    this.repository = repository;
	}	
 
	@ResponseStatus(HttpStatus.NOT_FOUND)
	class UnitNotFoundException extends RuntimeException {
		private static final long serialVersionUID = 1L;
	    public UnitNotFoundException() {
	        super("Unit requested does not exist");
	    }
	}
	
	@GetMapping
	Collection<?> readUnits(){
	    return this.repository.findAll();
	}
	
	@GetMapping("/{id}")
	UnitsModel readUnits(@PathVariable String id) {
	    try {
			return (UnitsModel) this.repository.findById(id)
			        .orElseThrow(UnitNotFoundException::new);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}	
	
	@GetMapping("/{unitvalue}/{id}")
	ConvertedUnit readUnit(@PathVariable Double unitvalue, @PathVariable("id") String id) { 
	    try {
			return (ConvertedUnit) this.repository.convertUnit(id,unitvalue)
			        .orElseThrow(UnitNotFoundException::new);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}	
	
}