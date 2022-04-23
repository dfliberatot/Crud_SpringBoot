package com.crud.angular.Service;

import com.crud.angular.Model.usuario;

public interface IValidateUserService {
	
	public Integer validateUser(Integer id, String password);
	public Boolean registerUser(usuario user);

}
