package Fabrica;

import Carro.*;

public interface IFabricaCarro {
    ICarro criarCarro(String nome, double preco, String marca);
}
