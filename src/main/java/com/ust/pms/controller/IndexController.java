package com.ust.pms.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.pms.model.CredentialConfiguration;

@RestController

public class IndexController {
	
	
	@Autowired
	CredentialConfiguration credentialConfiguration;
	
	@Value("${companyName}")
	String cName;
	
	
	@RequestMapping("/")
	public String index() {		
		return "Welcomes Page" + cName;
	}
	
	
	@RequestMapping("/displayCredentials")
	public Map displayCredentials() {
		
		 Map data = new HashMap();
		 
		 data.put("username", credentialConfiguration.getUsername());
		 data.put("password", credentialConfiguration.getPassword());
		 data.put("secretquestion", credentialConfiguration.getSecretquestion());
		 data.put("secretanswer", credentialConfiguration.getSecretanswer());		
		return data;
	}
	
	

}
