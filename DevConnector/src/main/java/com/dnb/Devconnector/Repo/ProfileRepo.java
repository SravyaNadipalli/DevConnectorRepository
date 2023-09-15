package com.dnb.Devconnector.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dnb.Devconnector.dto.RegisterUse;
import com.dnb.Devconnector.dto.UserProfile;
@Repository
public interface ProfileRepo extends CrudRepository<UserProfile, String>{
	

}
