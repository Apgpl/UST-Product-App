package com.ust.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ust.pms.model.User;
import com.ust.pms.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginRepository loginRepository;

	@Override
	public String userRegistration(User user) {		
		
		if(user.getUserName()!=null && !user.getUserName().trim().isEmpty()){
			
		loginRepository.save(user);
		
		return "User Registered Successfully";
		}
		else {
			return "User  Registered Not Successfully";
		}		
	}	
	
	@Override
	public User getUserDetail(String userName) {
		// TODO Auto-generated method stub		
		User user= loginRepository.findByUserName(userName);
		return user;
	}
	
}
