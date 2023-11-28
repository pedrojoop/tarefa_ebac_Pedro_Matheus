package Carro;

import Carro.ICarro;

public class CarroLuxo implements ICarro {
    private String nome;
    private double preco;
    private String marca;

    public CarroLuxo(String nome, double preco, String marca) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
    }
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getMarca() {
        return marca;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro de luxo criado. Nome: " + nome + ", Preço: " + preco + ", Marca: " + marca);
    }
}
