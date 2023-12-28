package Test.Java;

import Main.Java.Repository.AcessorioRepository;
import Main.Java.Service.AcessorioService;
import Main.Java.domain.Acessorio;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author pmpedrolima@gmail.com
 */
public class AcessorioServiceTest {

    private AcessorioRepository acessorioRepository = new AcessorioRepository();
    private AcessorioService acessorioService = new AcessorioService(acessorioRepository);

    @Test
    public void testListarAcessorios() {
        Acessorio acessorio1 = new Acessorio();
        acessorio1.setNome("Acessorio1");
        acessorioService.salvarAcessorio(acessorio1);

        Acessorio acessorio2 = new Acessorio();
        acessorio2.setNome("Acessorio2");
        acessorioService.salvarAcessorio(acessorio2);

        List<Acessorio> acessorios = acessorioService.listarAcessorios();

        assertFalse(((List<?>) acessorios).isEmpty());
        assertEquals(2, acessorios.size());
    }

    @Test
    public void testObterAcessorioPorId() {
        Acessorio acessorio1 = new Acessorio();
        acessorio1.setNome("Acessorio1");
        acessorioService.salvarAcessorio(acessorio1);

        Acessorio acessorio2 = new Acessorio();
        acessorio2.setNome("Acessorio2");
        acessorioService.salvarAcessorio(acessorio2);

        Acessorio accessorioObtido = acessorioService.obterAcessorioPorId(acessorio1.getId());

        assertNotNull(accessorioObtido);
        assertEquals("Acessorio1", accessorioObtido.getNome());
    }

    @Test
    public void testSalvarAcessorio() {
        Acessorio novaAcessorio = new Acessorio();
        novaAcessorio.setNome("NovaAcessorio");

        acessorioService.salvarAcessorio(novaAcessorio);

        assertNotNull(novaAcessorio.getId());

        Acessorio acessorioObtida = acessorioService.obterAcessorioPorId(novaAcessorio.getId());

        assertNotNull(acessorioObtida);
        assertEquals("NovaAcessorio", acessorioObtida.getNome());
    }

    @Test
    public void testDeletarAcessorio() {
        Acessorio acessorio = new Acessorio();
        acessorio.setNome("AcessorioParaDeletar");
        acessorioService.salvarAcessorio(acessorio);

        acessorioService.deletarAcessorio(acessorio.getId());

        assertNull(acessorioService.obterAcessorioPorId(acessorio.getId()));
    }
}

