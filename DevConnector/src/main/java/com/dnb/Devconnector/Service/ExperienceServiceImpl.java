package com.dnb.Devconnector.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnb.Devconnector.Repo.ExperienceRepo;
import com.dnb.Devconnector.dto.Experience;
import com.dnb.Devconnector.dto.RegisterUse;

@Service
public class ExperienceServiceImpl implements ExperienceService {
@Autowired
ExperienceRepo experienceRepo;
	@Override
	public Experience createExperience(Experience experience) {
		// TODO Auto-generated method stub
		return experienceRepo.save(experience);
	}

	@Override
	public boolean deleteExperience(String expid) {
		// TODO Auto-generated method stub
		if(experienceRepo.existsById(expid)) {
			experienceRepo.deleteById(expid);
			return true;
		}
		else
			//exception
		return false;
	}

	@Override
	public Optional<Experience> getExperienceByexpid(String expid) {
		// TODO Auto-generated method stub
		return experienceRepo.findById(expid);
	}

	@Override
	public Iterable<Experience> getAllExperience() {
		// TODO Auto-generated method stub
		return experienceRepo.findAll();
	}

}
