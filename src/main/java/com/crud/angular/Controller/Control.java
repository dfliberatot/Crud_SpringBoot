package com.crud.angular.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.angular.Model.Articulo;
import com.crud.angular.Repository.iarticuloRepository;
import com.crud.angular.Service.articuloService;

@RestController
@RequestMapping("/articulos")
@CrossOrigin(origins = "*", methods= {
		RequestMethod.GET,
		RequestMethod.POST,
		RequestMethod.DELETE,
		RequestMethod.HEAD,
		RequestMethod.OPTIONS,
		RequestMethod.PUT})
public class Control {

	@Autowired
	private articuloService serviceArticulo;

	@Autowired
	private iarticuloRepository repoArticulo;

	
	@GetMapping("/seleccionarArticulos/{id}")
		public Optional<Articulo> seleccionarArticulo(@PathVariable ("id") Integer id){
		return repoArticulo.findById(id);
	}

	@PostMapping("/insertarArticulos")
	public void insertarArticulos(@RequestBody Articulo articulo) {
		serviceArticulo.agregarArticulo(articulo);
	}
	
	@PutMapping("/actualizarArticulo")
	public void actualizarArticulo(@RequestBody Articulo articulo) {
		serviceArticulo.agregarArticulo(articulo);
	}

	@GetMapping("/listarArticulos")
	public List<Articulo> listarArticulos() {
		return repoArticulo.findAll();
	}
	
	@DeleteMapping("/eliminarArticulos/{id}")
	public void eliminarArticulo(@PathVariable ("id") Integer id) {
		serviceArticulo.elimiarArticulo(id);
	}
	
	

}
