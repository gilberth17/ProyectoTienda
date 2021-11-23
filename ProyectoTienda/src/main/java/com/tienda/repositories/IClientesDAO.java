package com.tienda.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tienda.modelos.ClientesDTO;
@Repository
public interface IClientesDAO extends MongoRepository<ClientesDTO,String>{

}
