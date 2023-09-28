package org.example.services;

import org.example.dao.IClienteDAO;
import org.example.domain.Cliente;
import org.example.exceptions.TipoChaveNaoEncontradaException;
import org.example.services.generics.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) {
		return this.dao.consultar(cpf);
	}
}
