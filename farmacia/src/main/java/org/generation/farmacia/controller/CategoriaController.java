package org.generation.farmacia.controller;

import java.util.List;

import org.generation.farmacia.model.CategoriaModel;
import org.generation.farmacia.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author marianatheml
 * @since 1.0
 * 
 *
 */

@RestController
@RequestMapping("/categorias")
@CrossOrigin("*")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<CategoriaModel>> findAllCategoria () {
		return ResponseEntity.ok(repository.findAll());
	}
	
}
