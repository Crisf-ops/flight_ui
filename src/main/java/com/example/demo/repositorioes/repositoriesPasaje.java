package com.example.demo.repositorioes;

import com.example.demo.models.Pasaje;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  repositoriesPasaje extends CrudRepository<Pasaje, Long >{
    
}
