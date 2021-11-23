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

import com.tienda.modelos.ProductosDTO;
import com.tienda.repositories.IProductoDAO;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api/productos")
public class ProductController {
	@Autowired
	private IProductoDAO repository;
	
	@PostMapping("/producto")
	public ProductosDTO create(@Validated @RequestBody ProductosDTO p) {
		return repository.insert(p);
	}
	@GetMapping("/")
	public List<ProductosDTO> readAll(){
		return repository.findAll();
	}
	@PutMapping("producto/{id}")
	public ProductosDTO updatre(@PathVariable String id, @Validated @RequestBody ProductosDTO p) {
		return repository.save(p);
	}
	@DeleteMapping("producto/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
}
