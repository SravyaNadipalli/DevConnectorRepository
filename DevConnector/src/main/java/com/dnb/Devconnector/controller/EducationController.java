package com.dnb.Devconnector.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnb.Devconnector.dto.Education;

@RestController
@RequestMapping("/api/education")
public class EducationController {
	@PostMapping("/create")
	public Education createEducation (@RequestBody Education education)
	{
		return education;
	}

}
