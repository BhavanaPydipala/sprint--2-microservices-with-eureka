package com.cg.backgroundverification.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.backgroundverification.entity.LoginDto;
import com.cg.backgroundverification.service.LoginService;

@RestController
@RequestMapping("/BackGroundVerification")
@CrossOrigin("http://localhost:4200")
public class BgvController
{
	@Autowired
	LoginService loginservice;
	
	
	//Login using id and password
	@GetMapping(value="/BackgroundVerifierLogin/{enter-userid}/{password}")
	public LoginDto authentication(@PathVariable ("enter-userid") int id,@PathVariable("password") String pass)
	{
		LoginDto loginobj=loginservice.authentication(id,pass);
			return loginobj;
			
		}
	
	
	}