package com.cjc.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.demo.model.Invoice;
import com.cjc.demo.repositary.HomeRepositary;

@Service
public class ServiceImpl implements ServiceI {

	@Autowired
	HomeRepositary hr;
	
	@Override
	public void register(Invoice iv) {
		// TODO Auto-generated method stub
		hr.save(iv);
	}

}
