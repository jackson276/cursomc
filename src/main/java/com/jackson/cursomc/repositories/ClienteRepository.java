package com.jackson.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jackson.cursomc.domain.Cliente;

@Repository
public interface  ClienteRepository extends JpaRepository<Cliente, Integer> {

}
