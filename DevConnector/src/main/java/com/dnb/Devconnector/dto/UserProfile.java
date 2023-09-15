package com.dnb.Devconnector.dto;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.dnb.Devconnector.Utils.CustomIdGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Getter
@NoArgsConstructor
@ToString
@Entity
@Table
public class UserProfile {
	
	@NotBlank(message = "user profile should not be blank")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userProfile_seq") //if generator is specified, then it'll know to use its wrapper class
	
	@GenericGenerator(name = "userProfile_seq", strategy = "com.dnb.Devconnector.Utils.CustomIdGenerator",
	       // parameters = {@Parameter(name =CustomIdGenerator.INCREMENT_PARAM, value = "50")
			parameters = {@Parameter(name =CustomIdGenerator.INCREMENT_PARAM, value = "50"),
			@Parameter(name=CustomIdGenerator.VALUE_PREFIX_PARAMETER, value = "pro_"),
			@Parameter(name=CustomIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d"),
			@Parameter(name=CustomIdGenerator.FLAG_PARAMETER, value = "true")
	})
	
	//UUID uuid ;//= UUID.randomUUID();
	@Column(nullable = false)
	private String select_professional_status;
	private String company;
	private String website;
	private String location;
	@Column(nullable = false)
	private String skills;
	@Id
	private String github_username;
	private String bio;
	@Column(nullable = true)
	private boolean social_network_links;
	private String twitter_url;
	private String facebook_url;
	private String youtube_url;
	private String linkedin_url;
	private String instagram_url;
	/*public void setSelect_professional_status(String select_professional_status) {
		this.select_professional_status = select_professional_status;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public void setGithub_username(String github_username) {
		this.github_username = github_username;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public void setSocial_network_links(boolean social_network_links) {
		this.social_network_links = social_network_links;
	}
	public void setTwitter_url(String twitter_url) {
		this.twitter_url = twitter_url;
	}
	public void setFacebook_url(String facebook_url) {
		this.facebook_url = facebook_url;
	}
	public void setYoutube_url(String youtube_url) {
		this.youtube_url = youtube_url;
	}
	public void setLinkedin_url(String linkedin_url) {
		this.linkedin_url = linkedin_url;
	}
	public void setInstagram_url(String instagram_url) {
		this.instagram_url = instagram_url;
	}
	public void setUUID(UUID uuid) {
		this.uuid = uuid;
	}
	
	
	public UserProfile(UUID uuid,String string1,String string2,String string3 , String string4,String string5,String string6,String string7,boolean string8,String string9,String string10,String string11,String string12,String string13 )
	{ 
		this.uuid=uuid;
		this.select_professional_status=string1;
		this.company=string2;
		this.website=string3;
		this.location=string4;
		this.skills=string5;
		this.github_username=string6;
		this.bio=string7;
		this.social_network_links=string8;
		this.twitter_url=string9;
		this.facebook_url=string10;
		this.youtube_url=string11;
		this.linkedin_url=string12;
		this.instagram_url=string13;
	}*/

}
