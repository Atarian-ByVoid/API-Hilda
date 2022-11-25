package com.br.hilda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.hilda.domain.Animals;


public interface AnimalsRepository  extends JpaRepository <Animals,Long>{
    
}
