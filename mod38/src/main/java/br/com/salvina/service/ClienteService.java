package br.com.salvina.service;

import br.com.salvina.dao.IClienteDAO;
import br.com.salvina.domain.Cliente;
import br.com.salvina.exceptions.DAOException;
import br.com.salvina.exceptions.MaisDeUmRegistroException;
import br.com.salvina.exceptions.TableException;
import br.com.salvina.service.generic.GenericService;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

@Stateless
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

    private IClienteDAO clienteDAO;

    @Inject
    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
        this.clienteDAO = clienteDAO;
    }

    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Cliente> filtrarClientes(String query) {
        return clienteDAO.filtrarClientes(query);
    }
}
