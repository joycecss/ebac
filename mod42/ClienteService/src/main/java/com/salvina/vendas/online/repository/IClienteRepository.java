package com.salvina.vendas.online.repository;


import com.salvina.vendas.online.domain.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long> {

    Optional<Cliente> findByCpf(Long cpf);
}
