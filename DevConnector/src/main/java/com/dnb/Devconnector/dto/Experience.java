package com.dnb.Devconnector.dto;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.dnb.Devconnector.Utils.CustomIdGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@Entity
public class Experience {
	@Id
	@NotBlank(message = "experience id should not be blank")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "experience_seq") //if generator is specified, then it'll know to use its wrapper class
	
	@GenericGenerator(name = "experience_seq", strategy = "com.dnb.Devconnector.Utils.CustomIdGenerator",
	       // parameters = {@Parameter(name =CustomIdGenerator.INCREMENT_PARAM, value = "50")
			parameters = {@Parameter(name =CustomIdGenerator.INCREMENT_PARAM, value = "50"),
			@Parameter(name=CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "exp_"),
			@Parameter(name=CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d"),
			@Parameter(name=CustomIdGenerator.FLAG_PARAMETER, value = "true")
	})
	private String expid;
	
	@Column(nullable = false)
	private String jobTitle;
	private String company;
	private String location;
	private String fromDate;
	private String toDate;
	private boolean currentJob;
	private String jobDescription;

}
