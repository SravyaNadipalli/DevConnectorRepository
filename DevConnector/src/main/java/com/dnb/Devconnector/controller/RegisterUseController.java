package com.dnb.Devconnector.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnb.Devconnector.dto.RegisterUse;
@RestController
@RequestMapping("/api/registeruse")
public class RegisterUseController {
	@PostMapping("/create")
	public RegisterUse createRegisterUse (@RequestBody RegisterUse registeruse )
	{
		return registeruse;
	}

}
