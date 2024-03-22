package br.com.salvina.dao;

import br.com.salvina.dao.generic.IGenericDAO;
import br.com.salvina.domain.Venda;
import br.com.salvina.exceptions.DAOException;
import br.com.salvina.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, Long> {
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    public Venda consultarComCollection(Long id);
}
