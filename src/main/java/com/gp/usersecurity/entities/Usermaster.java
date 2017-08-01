package com.gp.usersecurity.entities;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the usermaster database table.
 * 
 */
@Entity
public class Usermaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userid;

	

	@Temporal(TemporalType.TIMESTAMP)
	private Date adddate;

	private Long adduserid;

	private String empid;

	

	@Temporal(TemporalType.TIMESTAMP)
	private Date editdate;

	private Long edituserid;

	private String firstname;

	private byte isdeleted;

	private String lastname;

	private Long roleid;

	private String username;

	private String password;

	public Usermaster() {
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getRoleid() {
		return roleid;
	}

	public void setRoleid(Long roleid) {
		this.roleid = roleid;
	}

	
	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public Date getAdddate() {
		return this.adddate;
	}

	public void setAdddate(Date adddate) {
		this.adddate = adddate;
	}

	public Date getEditdate() {
		return this.editdate;
	}

	public void setEditdate(Date editdate) {
		this.editdate = editdate;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public byte getIsdeleted() {
		return this.isdeleted;
	}

	public void setIsdeleted(byte isdeleted) {
		this.isdeleted = isdeleted;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Long getAdduserid() {
		return adduserid;
	}

	public void setAdduserid(Long adduserid) {
		this.adduserid = adduserid;
	}



	public Long getEdituserid() {
		return edituserid;
	}

	public void setEdituserid(Long edituserid) {
		this.edituserid = edituserid;
	}

}