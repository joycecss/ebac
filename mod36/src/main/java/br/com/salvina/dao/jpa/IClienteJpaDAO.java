package br.com.salvina.dao.jpa;

import br.com.salvina.dao.generics.jpa.IGenericJapDAO;
import br.com.salvina.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{
}
