package com.dnb.Devconnector.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.dnb.Devconnector.dto.Experience;
import com.dnb.Devconnector.dto.RegisterUse;

public interface ExperienceService {
public Experience createExperience(Experience experience);
	
	public boolean deleteExperience(String expid);
	
	public Optional<Experience> getExperienceByexpid(String expid);
	
    public Iterable<Experience> getAllExperience();

}
