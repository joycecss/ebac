package org.example.dao.jpa;

import org.example.dao.generics.jpa.GenericJpaDAO;
import org.example.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {
    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }
}
