package Fabrica;

import Carro.*;

public class FabricaCarroLuxo implements IFabricaCarro{
    @Override
    public ICarro criarCarro(String nome, double preco, String marca) {
        return new CarroLuxo(nome, preco, marca);
    }

}
