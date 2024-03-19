import dao.ClienteDaoMock;
import org.example.dao.IClienteDAO;
import org.example.domain.Cliente;
import org.example.exceptions.DAOException;
import org.example.exceptions.MaisDeUmRegistroException;
import org.example.exceptions.TableException;
import org.example.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteDAOTest {

    private IClienteDAO clientDAO;
    private Cliente cliente;

    @Before
    public void init() throws TipoChaveNaoEncontradaException, DAOException {
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
    public void pesquisarCliente() throws MaisDeUmRegistroException, DAOException, TableException {
        Cliente clienteConsultado = clientDAO.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        cliente.setCpf(985489666L);
        Boolean retorno = clientDAO.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void atualizarCliente() throws TipoChaveNaoEncontradaException, DAOException {
        cliente.setNome("Teste");
        clientDAO.alterar(cliente);
        Assert.assertEquals("Teste", cliente.getNome());
    }

    @Test
    public void excluirCliente() throws DAOException {
        clientDAO.excluir(cliente.getCpf());
    }
}
