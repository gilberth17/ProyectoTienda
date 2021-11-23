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

import com.tienda.modelos.ClientesDTO;
import com.tienda.repositories.IClientesDAO;



@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api/Clientes")
public class ClienteController {
	@Autowired
	private IClientesDAO repository;
	
	@PostMapping("/cliente")
	public ClientesDTO create(@Validated @RequestBody ClientesDTO  c) {
		return repository.insert(c);
	}
	@GetMapping("/")
	public List<ClientesDTO > readAll(){
		return repository.findAll();
	}
	@PutMapping("cliente/{id}")
	public ClientesDTO  updatre(@PathVariable String id, @Validated @RequestBody ClientesDTO  c) {
		return repository.save(c);
	}
	@DeleteMapping("cliente/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
}
