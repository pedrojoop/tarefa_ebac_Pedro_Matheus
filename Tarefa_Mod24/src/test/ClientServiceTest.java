package test;

import dao.ClientDAOMock;
import dao.ClientDao;
import dao.IClientDAO;
import org.junit.Assert;
import org.junit.Test;
import service.ClientService;

/**
 * @author pmpedrolima@gmail.com
 */
public class ClientServiceTest {
    @Test
    public void saveTest() {
        IClientDAO mockDao = new ClientDAOMock();
        ClientService service = new ClientService(mockDao);
        String retorno = service.Save();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void waitingErrorInsaveTest() {
        IClientDAO mockDao = new ClientDao();
        ClientService service = new ClientService(mockDao);
        String retorno = service.Save();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test
    public void buscarTest() {
        IClientDAO mockDao = new ClientDAOMock();
        ClientService service = new ClientService(mockDao);
        Object cliente = service.buscar(1);
        Assert.assertNull(cliente);
    }

    @Test
    public void excluirTest() {
        IClientDAO mockDao = new ClientDAOMock();
        ClientService service = new ClientService(mockDao);
        service.excluir(1);
    }

    @Test
    public void atualizarTest() {
        IClientDAO mockDao = new ClientDAOMock();
        ClientService service = new ClientService(mockDao);
        Object cliente = new Object();
        service.atualizar(1, cliente);
    }
}
