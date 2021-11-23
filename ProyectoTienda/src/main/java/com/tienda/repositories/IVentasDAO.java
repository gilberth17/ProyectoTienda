package com.tienda.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.tienda.modelos.VentasDTO;

@Repository
public interface IVentasDAO extends MongoRepository<VentasDTO,String>{

}
