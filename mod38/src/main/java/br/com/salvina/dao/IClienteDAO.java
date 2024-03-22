package br.com.salvina.dao;

import br.com.salvina.dao.generic.IGenericDAO;
import br.com.salvina.domain.Cliente;

import java.util.List;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {
    List<Cliente> filtrarClientes(String query);
}
