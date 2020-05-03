package com.cg.backgroundverification.service;


import com.cg.backgroundverification.entity.EmployeeDocumentDto;

public interface BcgService {


	EmployeeDocumentDto getByName(String name);

	

}
