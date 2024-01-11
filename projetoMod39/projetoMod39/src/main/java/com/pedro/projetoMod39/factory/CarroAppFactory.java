package com.pedro.projetoMod39.factory;

import com.pedro.projetoMod39.controller.CarroController;
import com.pedro.projetoMod39.repository.CarroRepository;
import com.pedro.projetoMod39.services.CarroService;

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


