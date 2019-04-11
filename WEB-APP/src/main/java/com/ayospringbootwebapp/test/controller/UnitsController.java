package com.ayospringbootwebapp.test.controller; 

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

import com.ayospringbootwebapp.test.dto.UnitDto;
////import com.ayospringbootwebapp.test.entitymodel.UserLogin;
import com.ayospringbootwebapp.test.service.RestClientUnitConvService;
////import com.ayospringbootwebapp.test.service.UserService;

@Controller
public class UnitsController {
	
	//define a services constant
    private final RestClientUnitConvService restservice;
    
    /////UserLogin loggedUser = null;

    //Argument contructor of controller, pass in the service
    //and Autowire it
    @Autowired
    public UnitsController(RestClientUnitConvService restservice){
       this.restservice = restservice;
    }

    /*@Autowired
    private UserService service;*/
    
	@RequestMapping({"/", "/onlineconvertunits/index", "/onlineconvertunits"})
	public String login() {
	  return "index";
	}

	@RequestMapping({"/onlineconvertunits/home"})
	public String home() {
	  return "home";
	}

	 @RequestMapping(value="/onlineconvertunits/login/{userName}/{password}", method=RequestMethod.GET)
	 public @ResponseBody String login(@PathVariable String userName, @PathVariable("password") String Password) {
		
		 //UNCOMMENT THIS (and its associated java classes) WHEN THE DATABASE IS AVAILABLE
		 
		 /* loggedUser = service.getUserById(userName); 
		 if (loggedUser != null && loggedUser.getPassword() == Password ){
			 service.addUserAuditEntry("Logged-user", "Logged in and redirected to Home Page");*/
		 	return "true";
		 /*} else {
			 return "false"; 
		 }*/
	 }
}