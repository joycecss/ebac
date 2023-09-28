import org.example.domain.Cliente;
import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {
    @Test
    public void salvarCliente() {
        Cliente cli = new Cliente();
        cli.adicionarNome("Joyce");
        Assert.assertEquals("Joyce", cli.getNome());
    }
}
