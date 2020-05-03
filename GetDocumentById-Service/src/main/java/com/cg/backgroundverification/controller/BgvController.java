package com.cg.backgroundverification.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.backgroundverification.entity.EmployeeDocumentDto;
import com.cg.backgroundverification.service.BcgService;

@RestController
@RequestMapping("/BackGroundVerification")
@CrossOrigin("http://localhost:4200")
public class BgvController
{
	
	@Autowired
	BcgService bcgservice;
	
	
	//getting the employee document by id
	@GetMapping(value="/GetDocumentById/{enter-id}")
	public List<EmployeeDocumentDto>getById(@PathVariable("enter-id")  int id)
	{
		EmployeeDocumentDto employeedocumentdtoobj=bcgservice.getById(id);
		List<EmployeeDocumentDto>list =new ArrayList<EmployeeDocumentDto>();
		list.add(employeedocumentdtoobj);
		return list;
	}
	
	}