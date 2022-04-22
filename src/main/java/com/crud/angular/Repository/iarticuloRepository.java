package com.crud.angular.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.angular.Model.Articulo;

public interface iarticuloRepository extends JpaRepository<Articulo,Integer> {

}
