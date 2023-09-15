package com.dnb.Devconnector.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnb.Devconnector.Repo.ProfileRepo;
import com.dnb.Devconnector.dto.RegisterUse;
import com.dnb.Devconnector.dto.UserProfile;
@Service
public class ProfileServiceImpl implements ProfileService {
	@Autowired
	ProfileRepo profileRepo;

	@Override
	public UserProfile createProfile(UserProfile userProfile) {
		// TODO Auto-generated method stub
		return profileRepo.save(userProfile);
	}

	@Override
	public Boolean deleteProfile(String github_username) {
		// TODO Auto-generated method stub
		if(profileRepo.existsById(github_username)) {
			profileRepo.deleteById(github_username);
			return true;
		}
		else
			//exception
		return false;
	}

	@Override
	public Optional<UserProfile> getProfileByGit(String github_username) {
		// TODO Auto-generated method stub
		return profileRepo.findById(github_username);
	}

	@Override
	public Iterable<UserProfile> getAllProfiles() {
		// TODO Auto-generated method stub
		return profileRepo.findAll();
	}


}
