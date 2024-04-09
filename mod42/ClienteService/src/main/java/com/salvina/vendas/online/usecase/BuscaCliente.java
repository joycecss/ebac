package com.salvina.vendas.online.usecase;

import com.salvina.vendas.online.domain.Cliente;
import com.salvina.vendas.online.exception.EntityNotFoundException;
import com.salvina.vendas.online.repository.IClienteRepository;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import org.springframework.data.domain.Pageable;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BuscaCliente {

    private IClienteRepository clienteRepository;


    public BuscaCliente(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Page<Cliente> buscar(Pageable pageable) {
        return (Page<Cliente>) clienteRepository.findAll();
    }

    public Cliente buscarPorId(String id) {
        return clienteRepository.findById(Long.valueOf(id))
                .orElseThrow(() -> new EntityNotFoundException(Cliente.class, "id", id));
    }

    public Boolean isCadastrado(String id) {
        Optional<Cliente> cliente = clienteRepository.findById(Long.valueOf(id));
        return cliente.isPresent() ? true : false;
    }

    public Cliente buscarPorCpf(Long cpf) {
        return clienteRepository.findByCpf(cpf)
                .orElseThrow(() -> new EntityNotFoundException(Cliente.class, "cpf", String.valueOf(cpf)));
    }
}
