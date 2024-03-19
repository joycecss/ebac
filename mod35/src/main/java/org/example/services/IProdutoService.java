package org.example.services;


import org.example.domain.Produto;
import org.example.services.generics.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {
}
