package br.com.salvina.dao.jpa;

import br.com.salvina.dao.generics.jpa.IGenericJapDAO;
import br.com.salvina.domain.jpa.VendaJpa;
import br.com.salvina.exceptions.DAOException;
import br.com.salvina.exceptions.TipoChaveNaoEncontradaException;

public interface IVendaJpaDAO extends IGenericJapDAO<VendaJpa, Long> {

    public void finalizarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public void cancelarVenda(VendaJpa venda) throws TipoChaveNaoEncontradaException, DAOException;

    public VendaJpa consultarComCollection(Long id);
}
