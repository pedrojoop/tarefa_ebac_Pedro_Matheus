import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Scanner para receber entrada do console
        Scanner scanner = new Scanner(System.in);

        // Solicita um valor ao usuário
        System.out.print("Digite um valor inteiro: ");
        int valorPrimitivo = scanner.nextInt();

        // Converte o valor para um wrapper Integer
        Integer valorWrapper = Integer.valueOf(valorPrimitivo);

        // Imprime o valor primitivo
        System.out.println("Valor primitivo: " + valorPrimitivo);

        // Imprime o valor wrapper
        System.out.println("Valor wrapper: " + valorWrapper);

        // Fecha o Scanner
        scanner.close();
    }
}
