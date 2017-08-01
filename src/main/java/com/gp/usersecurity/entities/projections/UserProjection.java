package com.gp.usersecurity.entities.projections;

import org.springframework.data.rest.core.config.Projection;

import com.gp.usersecurity.entities.Usermaster;

@Projection(name = "user", types = { Usermaster.class })
public interface UserProjection {
	String getUsername();

	String getEmpid();

	String getPassword();

	Long getRoleid();

	String getFirstname();

	byte getIsdeleted();

	String getLastname();

	Long getUserid();

}
