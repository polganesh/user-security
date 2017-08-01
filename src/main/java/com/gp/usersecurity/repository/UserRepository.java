/**
 * 
 */
package com.gp.usersecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.gp.usersecurity.entities.Usermaster;

/**
 * @author ganeshp
 *
 */
@RepositoryRestResource(collectionResourceRel = "usermaster", path = "userdetails")
public interface UserRepository extends JpaRepository<Usermaster, Long> {
	
	
	Usermaster findByUsername(@Param("username") String username);

	
}
