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

import com.tienda.modelos.ConsolidadoDTO;
import com.tienda.repositories.IConsolidadoDAO;



@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api/Consolidado")
public class ConsolidadoController {
	@Autowired
	private IConsolidadoDAO repository;
	
	@PostMapping("/Consolidado")
	public ConsolidadoDTO create(@Validated @RequestBody ConsolidadoDTO  c) {
		return repository.insert(c);
	}
	@GetMapping("/")
	public List<ConsolidadoDTO > readAll(){
		return repository.findAll();
	}
	@PutMapping("Consolidado/{id}")
	public ConsolidadoDTO  updatre(@PathVariable String id, @Validated @RequestBody ConsolidadoDTO  c) {
		return repository.save(c);
	}
	@DeleteMapping("Consolidado/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}

}
