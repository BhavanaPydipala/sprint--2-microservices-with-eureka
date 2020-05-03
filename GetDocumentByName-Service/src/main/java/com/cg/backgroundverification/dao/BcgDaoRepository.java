package com.cg.backgroundverification.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.backgroundverification.entity.EmployeeDocumentDto;


public interface BcgDaoRepository  extends JpaRepository<EmployeeDocumentDto,Integer>{
	
	@Query("select employee from EmployeeDocumentDto employee  where empName=?1 ")
	EmployeeDocumentDto getByName(String name);
	
   
}
