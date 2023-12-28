package Main.Java.Service;

import Main.Java.Repository.AcessorioRepository;
import Main.Java.domain.Acessorio;

import java.util.List;

/**
 * @author pmpedrolima@gmail.com
 */
public class AcessorioService {

    private AcessorioRepository acessorioRepository;

    public AcessorioService(AcessorioRepository acessorioRepository) {
        this.acessorioRepository = acessorioRepository;
    }

    public List<Acessorio> listarAcessorios() {
        return acessorioRepository.listarAcessorios();
    }

    public Acessorio obterAcessorioPorId(Long id) {
        return acessorioRepository.obterAcessorioPorId(id);
    }

    public void salvarAcessorio(Acessorio acessorio) {
        acessorioRepository.salvarAcessorio(acessorio);
    }

    public void deletarAcessorio(Long id) {
        acessorioRepository.deletarAcessorio(id);
    }
}

