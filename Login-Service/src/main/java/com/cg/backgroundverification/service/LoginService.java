package com.cg.backgroundverification.service;



import com.cg.backgroundverification.entity.LoginDto;


public interface LoginService 
{

	public LoginDto authentication(int empId, String password);
	

}
