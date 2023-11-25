/*
 * @author pmpedrolima@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        // Criando uma pessoa jurídica
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Empresa XYZ", "Rua A, 123", "12345678901234");

        // Imprimindo os detalhes da pessoa jurídica
        pessoaJuridica.imprimirDetalhes();

        // Criando uma pessoa física
        PessoaFisica pessoaFisica = new PessoaFisica("João", "Rua B, 456", "98765432198");

        // Imprimindo os detalhes da pessoa física
        pessoaFisica.imprimirDetalhes();
    }
}