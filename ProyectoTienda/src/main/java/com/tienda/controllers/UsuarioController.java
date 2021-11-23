package com.tienda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
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


import com.tienda.modelos.UsuariosDTO;
import com.tienda.repositories.IUsuariosDAO;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api/Usuarios")

public class UsuarioController {
	@Autowired
	private IUsuariosDAO repository;
	
	@PostMapping("/Usuario")
	public UsuariosDTO create(@Validated @RequestBody UsuariosDTO u) {
		return repository.insert(u);
	}
	@GetMapping("/")
	public List<UsuariosDTO> readAll(){
		return repository.findAll();
	}
	@PutMapping("Usuario/{id}")
	public UsuariosDTO updatre(@PathVariable String id, @Validated @RequestBody UsuariosDTO u) {
		return repository.save(u);
	}
	@DeleteMapping("Usuario/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
}
