package com.pedro.projetoMod38.factory;

import com.pedro.projetoMod38.controller.CarroController;
import com.pedro.projetoMod38.repository.CarroRepository;
import com.pedro.projetoMod38.services.CarroService;

public class CarroAppFactory {

    private static CarroController carroController;
    private static CarroService carroService;
    private static CarroRepository carroRepository;

    static {
        inicializar();
    }

    private static void inicializar() {
        carroController = new CarroController();
        carroService = new CarroService();
        carroRepository = new CarroRepository();
    }

    public static CarroController criarCarroController() {
        return carroController;
    }

    public static CarroService criarCarroService() {
        return carroService;
    }

    public static CarroRepository criarCarroRepository() {
        return carroRepository;
    }
}


