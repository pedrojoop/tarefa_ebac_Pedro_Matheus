package com.pedro.projetoMod38;
import com.pedro.projetoMod38.repository.CarroRepository;
import com.pedro.projetoMod38.services.CarroService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import com.pedro.projetoMod38.domain.Carro;


/**
 * @author pmpedrolima@gmail.com
 */
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CarroServiceTest {

    @Autowired
    private CarroService carroService;

    @Test
    @Transactional
    public void testValidarEGravar() {
        Carro carro = new Carro();
        carro.setModelo("ModeloTeste");
        carro.setMarca("MarcaTeste");

        assertDoesNotThrow(() -> carroService.validarEGravar(carro));
    }

    @Test
    public void testFindCar() {
        Carro carro = new Carro();
        carro.setModelo("ModeloTeste");
        carro.setMarca("MarcaTeste");
        carroService.validarEGravar(carro);

        List<Carro> carrosEncontrados = carroService.pesquisarCarros("ModeloTeste", "MarcaTeste");
        assertNotNull(carrosEncontrados);
        assertEquals(1, carrosEncontrados.size());

        List<Carro> carrosNaoEncontrados = carroService.pesquisarCarros("ModeloInexistente", "MarcaInexistente");
        assertNotNull(carrosNaoEncontrados);
        assertTrue(carrosNaoEncontrados.isEmpty());
    }
}


