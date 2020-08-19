package com.test.SmartyPants.Simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AppointmentController {

	@Autowired
	private AppoymentServiceImpl impl;
	
	@PostMapping("/appoint")
	public ResponseEntity<Object> getAppointment(@RequestBody AppoymentDetails details){
		
		AppoymentResponse response = impl.getSlot(details);
	
		return new ResponseEntity<Object>(response,HttpStatus.OK);
		
	}
}
