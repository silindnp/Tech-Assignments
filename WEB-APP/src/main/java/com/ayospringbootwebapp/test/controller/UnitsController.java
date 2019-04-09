package com.ayospringbootwebapp.test.controller; 

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.ui.Model;

import com.ayospringbootwebapp.test.dto.UnitDto;
import com.ayospringbootwebapp.test.entitymodel.UserLogin;
import com.ayospringbootwebapp.test.service.RestClientUnitConvService;
import com.ayospringbootwebapp.test.service.UserService;

@Controller
public class UnitsController {
	
	//define a services constant
    private final RestClientUnitConvService restservice;
    
    UserLogin loggedUser = null;

    //Argument contructor of controller, pass in the service
    //and Autowire it
    @Autowired
    public UnitsController(RestClientUnitConvService restservice){
       this.restservice = restservice;
    }

    @Autowired
    private UserService service;
    
	@RequestMapping({"/", "/onlineconvertunits"})
	public String login() {
	  return "index";
	}
	 
	 @RequestMapping("/onlineconvertunits/login/{userName}/{password}")
	 public String home(@PathVariable String userName, @PathVariable("password") String Password) {
		 loggedUser = service.getUserById(userName); 
		 if (loggedUser != null && loggedUser.getPassword() == Password ){
			 service.addUserAuditEntry("Logged-user", "Logged in and redirected to Home Page");
		 	return "home";
		 } else {
			 return "index"; 
		 }
	 }
	 
	 @RequestMapping("/onlineconvertunits/convert/{unitvalue}/{id}")
	 public UnitDto convert(@PathVariable Double unitvalue, @PathVariable("id") String id, Model model) {
		 //System.out.println("Unit-ID = " + id + "  ---- Value = " + unitvalue);
	    UnitDto udt = new UnitDto();
	    udt = restservice.convertUnit(id,unitvalue);
	    System.out.println("Unit-ID = " + udt.getId() + " , " + udt.getDescription());
	    service.addUserAuditEntry("Logged-user", "Requesting Unit Conversion");
		//model.addAttribute("unitdto", udt);
	  return udt;
	 }
}