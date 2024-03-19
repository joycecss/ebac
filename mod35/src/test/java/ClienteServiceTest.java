import dao.ClienteDaoMock;
import org.example.dao.IClienteDAO;
import org.example.domain.Cliente;
import org.example.exceptions.DAOException;
import org.example.exceptions.TipoChaveNaoEncontradaException;
import org.example.services.ClienteService;
import org.example.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ClienteServiceTest {

    private IClienteService clientService;
    private Cliente cliente;

    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setCpf(985489656L);
        cliente.setNome("joyce");
        cliente.setCidade("Mauá");
        cliente.setEstado("SP");
        cliente.setEnd("Rua A");
        cliente.setNumero(89);
        cliente.setNumero(987485623);
    }

    public ClienteServiceTest(){
        IClienteDAO dao = new ClienteDaoMock();
        clientService = new ClienteService(dao);
    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = null;
        try {
            clienteConsultado = clientService.buscarPorCPF(cliente.getCpf());
        } catch (org.example.exceptions.DAOException e) {
            throw new RuntimeException(e);
        }
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        Boolean retorno = clientService.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() throws DAOException {
        clientService.excluir(cliente.getCpf());
    }

    @Test
    public void atualizarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        cliente.setNome("Teste");
        clientService.alterar(cliente);
        Assert.assertEquals("Teste", cliente.getNome());
    }
}
