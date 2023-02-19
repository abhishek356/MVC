package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.dao.DaoLayer;
import com.spring.model.User;



@Component
public class ServiceLayerImplementer implements ServiceLayer{

	@Autowired
	DaoLayer daoLayer;
	
	@Override
	public boolean saveDetails(User user) {
		// TODO Auto-generated method stub
	return daoLayer.saveDetails(user);
	}

}
