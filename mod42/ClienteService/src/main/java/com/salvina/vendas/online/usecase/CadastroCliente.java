package com.salvina.vendas.online.usecase;

import com.salvina.vendas.online.domain.Cliente;
import com.salvina.vendas.online.repository.IClienteRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CadastroCliente {
    private IClienteRepository clienteRepository;


    public CadastroCliente(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public Cliente cadastrar(@Valid Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    public Cliente atualizar(@Valid Cliente cliente) {
        return this.clienteRepository.save(cliente);
    }

    public void remover(String id) {
        this.clienteRepository.deleteById(Long.valueOf(id));
    }
}
