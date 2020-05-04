package com.cg.backgroundverification.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.backgroundverification.entity.VerificationDto;
import com.cg.backgroundverification.service.BcgService;

@RestController
@RequestMapping("/BackGroundVerification")
@CrossOrigin("http://localhost:4200")
public class BgvController
{
	
	@Autowired
	BcgService bcgservice;
	
	//setting the status of document 
	@PutMapping(value="/SetStatus")
	public void setstatus(@RequestBody VerificationDto verification)
	{
		
		bcgservice.setstatus(verification);
		
	}
	}