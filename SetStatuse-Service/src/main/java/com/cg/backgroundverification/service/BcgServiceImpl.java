package com.cg.backgroundverification.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.backgroundverification.dao.BcgStatusRepository;
import com.cg.backgroundverification.entity.VerificationDto;

@Service
public class BcgServiceImpl implements  BcgService {
	@Autowired
	BcgStatusRepository bcgstatusdao;
	
	@Override
	public VerificationDto setStatus(VerificationDto verificationdto) {
		// TODO Auto-generated method stub
		return bcgstatusdao.save(verificationdto);
		
	}

	
}
