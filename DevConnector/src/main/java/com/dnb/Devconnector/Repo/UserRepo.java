package com.dnb.Devconnector.Repo;

import java.util.Optional;

import javax.imageio.spi.RegisterableService;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dnb.Devconnector.dto.RegisterUse;
@Repository
public interface UserRepo extends CrudRepository<RegisterUse, String> {

	//Optional<RegisterUse> findById(String emailid);

}
