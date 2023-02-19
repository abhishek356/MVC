package com.spring.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.model.User;






@Component
public class DaoLayerImplementer implements DaoLayer{

	
	
	
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	Properties property = new Properties();{
	
	try {
		
		property.load(new FileInputStream("/mvc/src/main/java/com/spring/util/property.properties"));
		
	}
	catch(IOException ex)
	{
		System.out.println("Error thrown while reading the property file :"+ex);
	}
	}
	@Override
	public boolean saveDetails(User user) {
		// TODO Auto-generated method stub
		System.out.println("Inside dao layer");
		System.out.println(property.getProperty("hello"));
		return false;
	}

}
