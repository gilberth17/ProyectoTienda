package com.tienda.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.tienda.modelos.UsuariosDTO;


@Repository
public interface IUsuariosDAO extends MongoRepository<UsuariosDTO,String>{

}
