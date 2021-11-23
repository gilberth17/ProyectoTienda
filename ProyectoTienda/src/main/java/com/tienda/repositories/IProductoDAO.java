package com.tienda.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tienda.modelos.ProductosDTO;

@Repository
public interface IProductoDAO extends MongoRepository<ProductosDTO,String>{
	

}
