/*
* @author pmpedrolima@gmail.com
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomesFemininos = new ArrayList<>();
        List<String> nomesMasculinos = new ArrayList<>();

        // Leitura dos nomes e sexos
        System.out.println("Digite os nomes e sexos (ex: pedro -m ou luciana -f). Digite 'fim' para encerrar.");

        while (true) {
            String entrada = scanner.nextLine().trim();
            if (entrada.equalsIgnoreCase("fim")) {
                break;
            }

            String[] partes = entrada.split("\\s+-");
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim().toLowerCase();

                if (sexo.equals("f")) {
                    nomesFemininos.add(nome);
                } else if (sexo.equals("m")) {
                    nomesMasculinos.add(nome);
                } else {
                    System.out.println("Sexo inválido. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Tente novamente.");
            }
        }

        // Ordena as listas
        Collections.sort(nomesFemininos);
        Collections.sort(nomesMasculinos);

        // Impressão dos grupos
        System.out.println("\nGrupos:");
        System.out.println("Femininos: " + nomesFemininos);
        System.out.println("Masculinos: " + nomesMasculinos);
    }
}
