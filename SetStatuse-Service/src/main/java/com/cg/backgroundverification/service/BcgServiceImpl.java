package com.cg.backgroundverification.service;



import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.backgroundverification.dao.BcgStatusRepository;
import com.cg.backgroundverification.entity.VerificationDto;

@Service
public class BcgServiceImpl implements  BcgService {
	@Autowired
	BcgStatusRepository bcgstatusdao;
	
	
	@Override
	public void setstatus(VerificationDto verification) {
		
		boolean b = bcgstatusdao.exists(verification.getVerfId());
		
		  
        if(b) 
        {
		long millis=System.currentTimeMillis();  
		Date enddate=new Date(millis); 
		verification.setEndDate(enddate);
		verification.setStartDate(verification.getEndDate());
		
        bcgstatusdao.save(verification);
        
		
	}
	
	}

	
}
