package com.dnb.Devconnector.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnb.Devconnector.Repo.UserRepo;
import com.dnb.Devconnector.dto.RegisterUse;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo userRepo;

	@Override
	public RegisterUse createUser(RegisterUse registerUse) {
		// TODO Auto-generated method stub
		//return null;
		return userRepo.save(registerUse);
	}

	@Override
	public boolean deleteUser(String emailid) {
		// TODO Auto-generated method stub
		if(userRepo.existsById(emailid)) {
			userRepo.deleteById(emailid);
			return true;
		}
		else
			//exception
		return false;
	}

	@Override
	public Optional<RegisterUse> getUserByEmail(String emailid) {
		// TODO Auto-generated method stub
		return userRepo.findById(emailid);
		//return Optional.empty();
	}

	@Override
	public List<RegisterUse> getAllUsers() {
		// TODO Auto-generated method stub
		return (List<RegisterUse>) userRepo.findAll();
		//return null;
	}




	
	
}
