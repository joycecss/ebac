package org.example.services;

import org.example.domain.Cliente;
import org.example.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {

    Boolean cadastrar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;

}
