import org.example.dao.IProdutoDAO;
import org.example.dao.ProdutoDAO;
import org.example.domain.Produto;
import org.example.exceptions.DAOException;
import org.example.exceptions.MaisDeUmRegistroException;
import org.example.exceptions.TableException;
import org.example.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

public class ProdutoDAOTest {

    private IProdutoDAO produtoDao;

    private Produto produto;

    public ProdutoDAOTest() {
        produtoDao = new ProdutoDAO();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException, DAOException {
        produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Produto 1");
        produto.setNome("Produto 1");
        produto.setValor(BigDecimal.TEN);
        produtoDao.cadastrar(produto);
    }

    @Test
    public void pesquisar() throws MaisDeUmRegistroException, DAOException, TableException {
        Produto produto = this.produtoDao.consultar(this.produto.getCodigo());
        Assert.assertNotNull(produto);
    }

    @Test
    public void salvar() throws TipoChaveNaoEncontradaException, DAOException {
        produto.setCodigo("A2");
        Boolean retorno = produtoDao.cadastrar(produto);
        assertTrue(retorno);
    }

    @Test
    public void excluir() throws DAOException {
        produtoDao.excluir(produto.getCodigo());
    }

    @Test
    public void alterarProduto() throws TipoChaveNaoEncontradaException, DAOException {
        produto.setNome("teste");
        produtoDao.alterar(produto);

        Assert.assertEquals("teste", produto.getNome());
    }

    @Test
    public void buscarTodos() throws DAOException {
        Collection<Produto> list = produtoDao.buscarTodos();
        assertTrue(list != null);
        assertTrue(list.size() == 2);
    }
}
