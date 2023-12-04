import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;
/**
 * @author pmpedrolima@gmail.com
 */
public class SepararGeneros {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Lista para armazenar as pessoas
            List<Pessoa> pessoas = lerPessoas(scanner);

            // Imprimir todas as pessoas
            System.out.println("Todas as pessoas:");
            imprimirPessoas(pessoas);

            // Filtrar mulheres usando streams
            List<Pessoa> mulheres = filtrarPorGenero(pessoas, "-f");

            // Filtrar homens usando streams
            List<Pessoa> homens = filtrarPorGenero(pessoas, "-m");

            System.out.println("\nMulheres:");
            imprimirPessoas(mulheres);

            System.out.println("\nHomens:");
            imprimirPessoas(homens);

            scanner.close();
        }

        // Método para ler pessoas do console
        private static List<Pessoa> lerPessoas(Scanner scanner) {
            List<Pessoa> pessoas = new ArrayList<>();

            System.out.println("Digite o nome e gênero (-f ou -m), ou digite 'sair' para parar:");

            while (scanner.hasNext()) {
                String nome = scanner.next();

                if (nome.equalsIgnoreCase("sair")) {
                    break;
                }

                String genero = scanner.next();

                pessoas.add(new Pessoa(nome, genero));
            }

            return pessoas;
        }

        // Método para filtrar pessoas por gênero usando streams
        private static List<Pessoa> filtrarPorGenero(List<Pessoa> pessoas, String genero) {
            return pessoas.stream()
                    .filter(p -> p.getGenero().equalsIgnoreCase(genero))
                    .collect(Collectors.toList());
        }

        // Método para imprimir pessoas
        private static void imprimirPessoas(List<Pessoa> pessoas) {
            if (pessoas.isEmpty()) {
                System.out.println("Nenhuma pessoa encontrada.");
            } else {
                pessoas.forEach(pessoa -> System.out.println(pessoa.getNome() + " - " + pessoa.getGenero()));
            }
        }
}