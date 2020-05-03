package com.cg.backgroundverification.service;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.backgroundverification.dao.LoginDaoRepository;
import com.cg.backgroundverification.entity.LoginDto;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginDaoRepository logindao;
	
	@Override
	public LoginDto authentication(int empId, String password) {
		// TODO Auto-generated method stub
		return logindao.authentication(empId,password);
	}

}
