package com.dnb.Devconnector.dto;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.dnb.Devconnector.Utils.CustomIdGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
@Entity
@Table
public class RegisterUse
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "crea_seq") //if generator is specified, then it'll know to use its wrapper class
	
	@GenericGenerator(name = "registerUser_seq", strategy = "com.dnb.Devconnector.Utils.CustomIdGenerator",
			parameters ={@Parameter(name =CustomIdGenerator.INCREMENT_PARAM, value = "50"),
			@Parameter(name=CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "user_"),
			@Parameter(name=CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d"),
			@Parameter(name=CustomIdGenerator.FLAG_PARAMETER, value = "false")
	})
	
   
	
	private String name;
	private String email;
	private String password;
	private String confirmpassword;
	  public RegisterUse(String name, String email , String password) {
			this.email=email;
			this.name=name;
			this.password=password;
			}
	
}


