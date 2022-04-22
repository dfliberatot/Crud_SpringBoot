package com.crud.angular.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.crud.angular.Service.IValidateUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/login")
@Api(tags = "login", value = "/login")
@CrossOrigin(origins = "*")
public class LoginController {

	
	@Autowired
	private IValidateUserService validateUser;
	
	@GetMapping("/validateUser")
	@ApiOperation(value = "validar el usuario")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Integer> validateUserService(@RequestParam(required = true) Integer id, @RequestParam(required = true)String password){
		
		try {
			
			return ResponseEntity.status(HttpStatus.OK).body(validateUser.validateUser(id, password));
			
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
		}
		
	}
	
	
}
