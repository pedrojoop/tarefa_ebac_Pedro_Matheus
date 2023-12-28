package Main.Java.Service;

import Main.Java.Repository.CarroRepository;
import Main.Java.domain.Carro;

import java.util.List;

/**
 * @author pmpedrolima@gmail.com
 */
public class CarroService {

    private CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public List<Carro> listarCarros() {
        return carroRepository.listarCarros();
    }

    public Carro obterCarroPorId(Long id) {
        return carroRepository.obterCarroPorId(id);
    }

    public void salvarCarro(Carro carro) {
        carroRepository.salvarCarro(carro);
    }

    public void deletarCarro(Long id) {
        carroRepository.deletarCarro(id);
    }
}

