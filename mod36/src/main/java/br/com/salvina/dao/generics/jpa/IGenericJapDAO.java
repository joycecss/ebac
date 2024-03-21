package br.com.salvina.dao.generics.jpa;

import br.com.salvina.domain.jpa.Persistente;
import br.com.salvina.exceptions.DAOException;
import br.com.salvina.exceptions.MaisDeUmRegistroException;
import br.com.salvina.exceptions.TableException;
import br.com.salvina.exceptions.TipoChaveNaoEncontradaException;

import java.io.Serializable;
import java.util.Collection;

public interface IGenericJapDAO <T extends Persistente, E extends Serializable> {

    public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(T entity) throws DAOException;

    public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E id) throws MaisDeUmRegistroException, TableException, DAOException;

    public Collection<T> buscarTodos() throws DAOException;
}
