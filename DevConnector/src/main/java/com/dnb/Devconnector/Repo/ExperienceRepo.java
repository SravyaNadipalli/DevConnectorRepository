package com.dnb.Devconnector.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dnb.Devconnector.dto.Experience;

@Repository
public interface ExperienceRepo extends CrudRepository<Experience, String>{
	
	

}
