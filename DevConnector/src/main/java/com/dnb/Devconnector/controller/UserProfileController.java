package com.dnb.Devconnector.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnb.Devconnector.dto.RegisterUse;
import com.dnb.Devconnector.dto.UserProfile;
@RestController
@RequestMapping("/api/userProfile")

public class UserProfileController {
	@PostMapping(name ="/create")
	public UserProfile createUserProfile (@RequestBody UserProfile  userProfile )
	{
		return  userProfile;
	}


}
