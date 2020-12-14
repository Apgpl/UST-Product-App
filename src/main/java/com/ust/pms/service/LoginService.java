package com.ust.pms.service;

import com.ust.pms.model.User;

public interface LoginService {
	
	public String userRegistration(User user);
	
	public User getUserDetail(String userName);

}
