package com.crud.angular.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.crud.angular.Repository.usuarioRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ValidateUserService implements IValidateUserService{
	
	@Autowired
	private usuarioRepository usuarioRepository;

	@Override
	public Integer validateUser(Integer id, String password) {
		
		Integer validate = 0;
		try {
			
			validate = usuarioRepository.valiateUser(id, password);
			
		} catch (Exception e) {
			//log.error("Usuario o contraseña incorrecta" + e.getMessage());
		}
		return validate;
	}
	

}
