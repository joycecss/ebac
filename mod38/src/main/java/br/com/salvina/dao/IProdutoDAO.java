package br.com.salvina.dao;

import br.com.salvina.dao.generic.IGenericDAO;
import br.com.salvina.domain.Produto;

import java.util.List;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {
    List<Produto> filtrarProdutos(String query);
}
