import Carro.ICarro;
import Fabrica.FabricaCarroEsportivo;
import Fabrica.FabricaCarroLuxo;
import Fabrica.IFabricaCarro;

public class Cliente {
    public static void main(String[] args) {
            IFabricaCarro fabricaLuxo = new FabricaCarroLuxo();
            ICarro carroLuxo = fabricaLuxo.criarCarro("Carro Luxo A", 100000.0, "Marca Luxo");
            carroLuxo.exibirInfo();

            IFabricaCarro fabricaEsportivo = new FabricaCarroEsportivo();
            ICarro carroEsportivo = fabricaEsportivo.criarCarro("Carro Esportivo B", 80000.0, "Marca Esportiva");
            carroEsportivo.exibirInfo();
        }
}
