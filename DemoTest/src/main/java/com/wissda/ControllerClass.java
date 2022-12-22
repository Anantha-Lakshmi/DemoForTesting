package com.wissda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ControllerClass {
	@Autowired
	private ServiceClass serviceClass;
	
	@RequestMapping("/")
	public @ResponseBody String greeting() {
		return "Hello this is the test application";
	}
	
	@GetMapping("/getemployee")
    public ResponseEntity<DocumentEmployee> getEmployeeByName(@RequestBody DocumentEmployee employee){
		return serviceClass.getEmployeeByName(employee.getName());
	}

}
