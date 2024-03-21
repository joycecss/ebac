package br.com.salvina.dao.jpa;

import br.com.salvina.dao.generics.jpa.GenericJpaDAO;
import br.com.salvina.dao.generics.jpa.GenericJpaDB1DAO;
import br.com.salvina.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {
    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }
}