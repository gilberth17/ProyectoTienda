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

import com.tienda.modelos.VentasDTO;
import com.tienda.repositories.IVentasDAO;



@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.POST,RequestMethod.GET,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/api/Ventas")

public class VentasController {
	@Autowired
	private IVentasDAO repository;
	
	@PostMapping("/Venta")
	public VentasDTO create(@Validated @RequestBody VentasDTO v) {
		return repository.insert(v);
	}
	@GetMapping("/")
	public List<VentasDTO> readAll(){
		return repository.findAll();
	}
	@PutMapping("Venta/{id}")
	public VentasDTO updatre(@PathVariable String id, @Validated @RequestBody VentasDTO v) {
		return repository.save(v);
	}
	@DeleteMapping("Venta/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
}
