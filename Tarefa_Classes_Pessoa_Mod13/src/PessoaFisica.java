/*
 * @author pmpedrolima@gmail.com
 */

// Definição da classe PessoaFisica, que herda de Pessoa
public class PessoaFisica extends Pessoa {
    // Atributo específico para PessoaFisica
    private String cpf;

    // Construtor
    public PessoaFisica(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    // Método getter para cpf
    public String getCpf() {
        return cpf;
    }

    // Método setter para cpf
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Sobrescrita do método imprimirDetalhes para incluir informações específicas de PessoaFisica
    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("CPF: " + cpf);
    }
}