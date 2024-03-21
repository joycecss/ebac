package br.com.salvina.dao.jpa;

import br.com.salvina.dao.generics.jpa.GenericJpaDB2DAO;
import br.com.salvina.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {
    public ClienteJpaDB2DAO() {
        super(ClienteJpa.class);
    }
}
