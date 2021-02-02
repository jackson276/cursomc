package com.jackson.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jackson.cursomc.domain.Categoria;
import com.jackson.cursomc.repositories.CategoriaRepository;
import com.jackson.cursomc.services.exceptions.ObejectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	
	public Categoria find(Integer id ) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObejectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		
	}

}
