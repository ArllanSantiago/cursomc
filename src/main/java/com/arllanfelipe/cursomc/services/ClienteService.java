package com.arllanfelipe.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arllanfelipe.cursomc.domain.Cliente;
import com.arllanfelipe.cursomc.repositories.ClienteRepository;
import com.arllanfelipe.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
    @Autowired
	private ClienteRepository repo;
	public Cliente buscar(Integer id) {
		Cliente obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado Id: " + id
					+ " tipo: "+ Cliente.class.getName());
		}
		
		return obj;
	}
}
