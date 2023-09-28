package org.example.dao;

import org.example.domain.Venda;
import org.example.exceptions.TipoChaveNaoEncontradaException;
import org.example.dao.generics.IGenericDAO;

public interface IVendaDAO extends IGenericDAO<Venda, String> {

    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException;
}
