package Test.Java;

import Main.Java.Repository.MarcaRepository;
import Main.Java.Service.MarcaService;
import Main.Java.domain.Marca;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author pmpedrolima@gmail.com
 */
public class MarcaServiceTest {

    private MarcaRepository marcaRepository = new MarcaRepository();
    private MarcaService marcaService = new MarcaService(marcaRepository);

    @Test
    public void testListarMarcas() {
        Marca marca1 = new Marca();
        marca1.setNome("Marca1");
        marcaService.salvarMarca(marca1);

        Marca marca2 = new Marca();
        marca2.setNome("Marca2");
        marcaService.salvarMarca(marca2);

        List<Marca> marcas = marcaService.listarMarcas();

        assertFalse(((List<?>) marcas).isEmpty());
        assertEquals(2, marcas.size());
    }

    @Test
    public void testObterMarcaPorId() {
        Marca marca = new Marca();
        marca.setNome("MarcaTeste");
        marcaService.salvarMarca(marca);

        Marca marcaObtida = marcaService.obterMarcaPorId(marca.getId());

        assertNotNull(marcaObtida);
        assertEquals("MarcaTeste", marcaObtida.getNome());
    }

    @Test
    public void testSalvarMarca() {
        Marca novaMarca = new Marca();
        novaMarca.setNome("NovaMarca");

        marcaService.salvarMarca(novaMarca);

        assertNotNull(novaMarca.getId());

        Marca marcaObtida = marcaService.obterMarcaPorId(novaMarca.getId());

        assertNotNull(marcaObtida);
        assertEquals("NovaMarca", marcaObtida.getNome());
    }

    @Test
    public void testDeletarMarca() {
        Marca marca = new Marca();
        marca.setNome("MarcaParaDeletar");
        marcaService.salvarMarca(marca);

        marcaService.deletarMarca(marca.getId());

        assertNull(marcaService.obterMarcaPorId(marca.getId()));
    }

}

