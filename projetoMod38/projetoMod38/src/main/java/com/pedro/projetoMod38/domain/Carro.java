package com.pedro.projetoMod38.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author pmpedrolima@gmail.com
 */
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name = "carros")
public class Carro {
    @Id
    private String id;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "marca")
    private String marca;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
