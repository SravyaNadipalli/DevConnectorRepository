package com.dnb.Devconnector.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnb.Devconnector.dto.Experience;

@RestController
@RequestMapping("/api/userProfile")
public class ExperienceController {
	@PostMapping("/create")
	public Experience createExperience (@RequestBody Experience experience)
	{
		return experience;
	}
	

}
