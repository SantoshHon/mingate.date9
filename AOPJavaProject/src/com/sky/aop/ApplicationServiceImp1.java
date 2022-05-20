package com.sky.aop;

import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ApplicationServiceImp1 implements ApplicationService{

	@Override
	public void processApplication() {
		System.out.println("in ApplicationServiceImp1");
		
	}
	@Auditable(value="check")
	//@Transactional
	public String processApplicationWithAudit()
	{
		System.out.println("process ApplicationFrom in service");
		return "success";
	}
	
	
	
	
	


}
