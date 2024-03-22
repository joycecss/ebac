package br.com.salvina.service;

import br.com.salvina.domain.Produto;
import br.com.salvina.service.generic.IGenericService;

import java.util.List;

public interface IProdutoService extends IGenericService<Produto, String> {
    List<Produto> filtrarProdutos(String query);
}
