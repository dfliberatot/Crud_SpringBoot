package com.crud.angular.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.crud.angular.Model.usuario;

public interface usuarioRepository extends JpaRepository<usuario, Integer>{
	
	@Query(value = "SELECT count(user) FROM usuario "
			+ "WHERE user_id = :id "
			+ "AND password = :password")
	Integer valiateUser(Integer id, String password);
}
