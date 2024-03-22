package br.com.salvina.service;

import br.com.salvina.domain.Cliente;
import br.com.salvina.exceptions.DAOException;
import br.com.salvina.service.generic.IGenericService;

import java.util.List;

public interface IClienteService extends IGenericService<Cliente, Long> {
    Cliente buscarPorCPF(Long cpf) throws DAOException;

    List<Cliente> filtrarClientes(String query);
}
