package com.dnb.Devconnector.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.dnb.Devconnector.dto.RegisterUse;

public interface UserService {
	public RegisterUse createUser(RegisterUse registerUse);
	
	public boolean deleteUser(String emailid);
	
	public Optional<RegisterUse> getUserByEmail(String emailid);
	
    public List<RegisterUse> getAllUsers();
}
