import dao.ClienteDaoMock;
import org.example.domain.Cliente;
import org.example.dao.IClienteDAO;
import org.example.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {

    private IClienteDAO clientDAO;
    private Cliente cliente;

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setCpf(985489656L);
        cliente.setNome("joyce");
        cliente.setCidade("Mauá");
        cliente.setEstado("SP");
        cliente.setEnd("Rua A");
        cliente.setNumero(89);
        cliente.setNumero(987485623);
        clientDAO.cadastrar(cliente);
    }
    public ClienteDAOTest(){
        clientDAO = new ClienteDaoMock();
    }
    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clientDAO.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setCpf(985489666L);
        Boolean retorno = clientDAO.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void atualizarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Teste");
        clientDAO.alterar(cliente);
        Assert.assertEquals("Teste", cliente.getNome());
    }

    @Test
    public void excluirCliente(){
        clientDAO.excluir(cliente.getCpf());
    }
}
