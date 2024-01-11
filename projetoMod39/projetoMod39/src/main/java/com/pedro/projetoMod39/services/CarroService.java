package com.pedro.projetoMod39.services;

import com.pedro.projetoMod39.domain.Carro;
import com.pedro.projetoMod39.repository.CarroRepository;
import com.pedro.projetoMod39.factory.CarroAppFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author pmpedrolima@gmail.com
 */
@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository = CarroAppFactory.criarCarroRepository();

    public void validarEGravar(Carro carro) {
        if (carro.getModelo() == null || carro.getMarca() == null) {
            throw new RuntimeException("Modelo e Marca são campos obrigatórios");
        }

        carroRepository.salvar(carro);
    }

    public List<Carro> listarCarros() {
        return carroRepository.findAll();
    }

    public void excluirCarro(String id) {
        carroRepository.excluirCarro(id);
    }

    public void editarCarro(String id, Carro carro) {
        carroRepository.editarCarro(id, carro);
    }

    public Carro buscarCarroPorId(String id) {
        carroRepository.findById(id);
        return null;
    }

    public List<Carro> pesquisarCarros(String modelo, String marca) {
        //carroRepository.findCar(modelo, marca);
        return carroRepository.findCar(modelo, marca);
    }
}

