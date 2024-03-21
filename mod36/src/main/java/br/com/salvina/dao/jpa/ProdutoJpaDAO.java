package br.com.salvina.dao.jpa;

import br.com.salvina.dao.generics.jpa.GenericJpaDAO;
import br.com.salvina.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {
    public ProdutoJpaDAO() {
        super(ProdutoJpa.class, "Postgre1");
    }
}
