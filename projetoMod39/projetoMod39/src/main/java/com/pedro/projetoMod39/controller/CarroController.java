package com.pedro.projetoMod39.controller;

import org.springframework.ui.Model;
import com.pedro.projetoMod39.domain.Carro;
import com.pedro.projetoMod39.services.CarroService;
import org.springframework.web.bind.annotation.*;


import javax.faces.bean.ManagedBean;

/**
 * @author pmpedrolima@gmail.com
 */
import java.util.List;

@ManagedBean
public class CarroController {

    private CarroService carroService;
    private Carro carro = new Carro();

    @GetMapping("/carros")
    public String listarCarros(Model model) {
        List<Carro> carros = carroService.listarCarros();
        model.addAttribute("carros", carros);
        return "listaCarros";
    }

    @GetMapping("/carros/{id}/editar")
    public String mostrarFormularioEdicao(@PathVariable String id, Model model) {
        Carro carro = carroService.buscarCarroPorId(id);
        model.addAttribute("carro", carro);
        return "formularioEdicaoCarro";
    }

    @PostMapping("/carros/{id}/editar")
    public String editarCarro(@PathVariable String id, @ModelAttribute Carro carro) {
        carroService.editarCarro(id, carro);
        return "redirect:/carros";
    }

    @GetMapping("/carros/{id}/excluir")
    public String excluirCarro(@PathVariable String id) {
        carroService.excluirCarro(id);
        return "redirect:/carros";
    }

    @GetMapping("/carros/pesquisar")
    public String mostrarFormularioPesquisa() {
        return "formularioPesquisaCarro";
    }

    @PostMapping("/carros/pesquisar")
    public String pesquisarCarros(
            @RequestParam("modelo") String modelo,
            @RequestParam("marca") String marca,
            Model model) {
        List<Carro> resultados = carroService.pesquisarCarros(modelo, marca);
        model.addAttribute("resultados", resultados);
        return "resultadosPesquisaCarro";
    }



    public CarroService getCarroService() {
        return carroService;
    }

    public void setCarroService(CarroService carroService) {
        this.carroService = carroService;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public void salvar() {
        carroService.validarEGravar(carro);
    }
}



