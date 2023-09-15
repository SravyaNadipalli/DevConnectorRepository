package com.dnb.Devconnector.dto;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.dnb.Devconnector.Utils.CustomIdGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@Entity
public class Education {
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "experience_seq") //if generator is specified, then it'll know to use its wrapper class
	
	@GenericGenerator(name = "education_seq", strategy = "com.dnb.Devconnector.Utils.CustomIdGenerator",
	       // parameters = {@Parameter(name =CustomIdGenerator.INCREMENT_PARAM, value = "50")
			parameters = {@Parameter(name =CustomIdGenerator.INCREMENT_PARAM, value = "50"),
			@Parameter(name=CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "edu_"),
			@Parameter(name=CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d"),
			@Parameter(name=CustomIdGenerator.FLAG_PARAMETER, value = "true")
	})
@Id
private String eduId;

private String school;

private String certificate;

private String field_of_study;

private String from_date;

private String to_date;

private boolean currentSchool;

private String program_description;
}



