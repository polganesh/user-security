/**
 * 
 */
package com.gp.usersecurity.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

import com.gp.usersecurity.entities.Usermaster;

/**
 * This repository has findAll methods available only to admin users
 * @author ganeshp
 *
 */
@RepositoryRestResource(collectionResourceRel = "usermaster", path = "userdetails")
public interface UserRepository extends JpaRepository<Usermaster, Long> {
	
	
	Usermaster findByUsername(@Param("username") String username);
	//---------------------------------------------------------

	@Override
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	default Page<Usermaster> findAll(Pageable arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	default List<Usermaster> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	default List<Usermaster> findAll(Iterable<Long> arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	default List<Usermaster> findAll(Sort arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	//----------------------------------------------------

	
}
