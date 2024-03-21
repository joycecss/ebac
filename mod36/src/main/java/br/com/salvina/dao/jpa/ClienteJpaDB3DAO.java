package br.com.salvina.dao.jpa;

import br.com.salvina.dao.generics.jpa.GenericJpaDB3DAO;
import br.com.salvina.domain.jpa.ClienteJpa2;

public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {
    public ClienteJpaDB3DAO() {
        super(ClienteJpa2.class);
    }
}
