import org.example.dao.IProdutoDAO;
import org.example.dao.ProdutoDAO;
import org.example.domain.Produto;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProdutoTest {
    private IProdutoDAO produtoDAO;

    public ProdutoTest(){
        produtoDAO = new ProdutoDAO();
    }

    @Test
    public void cadastrar(){
        Produto produto = new Produto();
        produto.setCodigo("A1");
        produto.setDescricao("Desc");
        produto.setNome("teste");
        produto.setValor(500d);
        produtoDAO.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}
