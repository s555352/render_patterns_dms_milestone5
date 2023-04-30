package com.baddamClasses.DMS.repository;


/**
 * @author S555352 Asritha Baddam
 * 
 */

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.baddamClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	
	List<Dog>findByName(String name);
	

}
