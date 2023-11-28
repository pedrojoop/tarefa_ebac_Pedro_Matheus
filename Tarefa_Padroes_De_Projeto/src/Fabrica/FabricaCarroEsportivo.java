package Fabrica;

import Carro.*;

public class FabricaCarroEsportivo implements IFabricaCarro{
    @Override
    public ICarro criarCarro(String nome, double preco, String marca) {
        return new CarroEsportivo(nome, preco, marca);
    }
}
