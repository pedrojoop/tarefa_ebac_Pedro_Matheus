package Test.Java;

import Main.Java.Repository.CarroRepository;
import Main.Java.Service.CarroService;
import Main.Java.domain.Carro;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author pmpedrolima@gmail.com
 */
public class CarroServiceTest {

    private CarroRepository carroRepository = new CarroRepository();
    private CarroService carroService = new CarroService(carroRepository);

    @Test
    public void testListarCarros() {
        Carro carro1 = new Carro();
        carro1.setModelo("Modelo1");
        carroService.salvarCarro(carro1);

        Carro carro2 = new Carro();
        carro2.setModelo("Modelo2");
        carroService.salvarCarro(carro2);

        List<Carro> carros = carroService.listarCarros();

        assertFalse(carros.isEmpty());
        assertEquals(2, carros.size());
    }

    @Test
    public void testObterCarroPorId() {
        Carro carro = new Carro();
        carro.setModelo("ModeloTeste");
        carroService.salvarCarro(carro);

        Carro carroObtido = carroService.obterCarroPorId(carro.getId());

        assertNotNull(carroObtido);
        assertEquals("ModeloTeste", carroObtido.getModelo());
    }

    @Test
    public void testSalvarCarro() {
        Carro novoCarro = new Carro();
        novoCarro.setModelo("NovoModelo");

        carroService.salvarCarro(novoCarro);

        assertNotNull(novoCarro.getId());

        Carro carroObtido = carroService.obterCarroPorId(novoCarro.getId());

        assertNotNull(carroObtido);
        assertEquals("NovoModelo", carroObtido.getModelo());
    }

    @Test
    public void testDeletarCarro() {
        Carro carro = new Carro();
        carro.setModelo("ModeloParaDeletar");
        carroService.salvarCarro(carro);

        carroService.deletarCarro(carro.getId());

        assertNull(carroService.obterCarroPorId(carro.getId()));
    }
}

