package com.crud.angular.Model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "usuario")
@Data
public class usuario {
	
	@Id
	@Column(name = "user_id" )
	private Integer user_id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "created_on")
	private Date created_on;

	@Column(name = "last_login")
	private Date last_login;

}
