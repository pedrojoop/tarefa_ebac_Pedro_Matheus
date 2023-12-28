package Main.Java.Service;

import Main.Java.Repository.MarcaRepository;
import Main.Java.domain.Marca;

import java.util.List;

/**
 * @author pmpedrolima@gmail.com
 */
public class MarcaService {

    private MarcaRepository marcaRepository;

    public MarcaService(MarcaRepository marcaRepository) {
        this.marcaRepository = marcaRepository;
    }

    public List<Marca> listarMarcas() {
        return marcaRepository.listarMarcas();
    }

    public Marca obterMarcaPorId(Long id) {
        return marcaRepository.obterMarcaPorId(id);
    }

    public void salvarMarca(Marca marca) {
        marcaRepository.salvarMarca(marca);
    }

    public void deletarMarca(Long id) {
        marcaRepository.deletarMarca(id);
    }
}

