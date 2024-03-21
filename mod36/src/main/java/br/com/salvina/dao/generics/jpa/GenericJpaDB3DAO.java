package br.com.salvina.dao.generics.jpa;

import br.com.salvina.domain.jpa.Persistente;

import java.io.Serializable;

public class GenericJpaDB3DAO <T extends Persistente, E extends Serializable>
        extends GenericJpaDAO<T,E> {

    public GenericJpaDB3DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Mysql1");
    }
}
