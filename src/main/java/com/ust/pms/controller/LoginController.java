package com.ust.pms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ust.pms.model.User;
import com.ust.pms.service.LoginService;

@RestController
@RequestMapping("lognreg")
@CrossOrigin(origins="http://localhost:4200")
public class LoginController {
	
	@Autowired
	LoginService loginService;
		
	// Saving the registration user  
	
	@PostMapping()
	public ResponseEntity<String> regUser(@RequestBody User user) {
		System.out.println(user);
		loginService.userRegistration(user);
		return new ResponseEntity<String>("User "+ user.getUserName()+" Registered Successfully", HttpStatus.OK);
	}
	
	// Getting the user details
	
	@GetMapping("/{userName}")
	public ResponseEntity<User> getUser(@PathVariable("userName") String userName) {
		
		User user=loginService.getUserDetail(userName);
		
		return new ResponseEntity<User>(user, HttpStatus.OK);		
		
	}

}
