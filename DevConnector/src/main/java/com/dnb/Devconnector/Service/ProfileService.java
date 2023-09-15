package com.dnb.Devconnector.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.dnb.Devconnector.dto.RegisterUse;
import com.dnb.Devconnector.dto.UserProfile;
@Service
public interface ProfileService {
	public UserProfile createProfile(UserProfile userProfile);
	public Boolean deleteProfile(String github_username);
	public Optional<UserProfile> getProfileByGit(String github_username);
	public Iterable<UserProfile> getAllProfiles();

}
