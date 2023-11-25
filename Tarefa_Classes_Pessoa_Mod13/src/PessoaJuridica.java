/*
 * @author pmpedrolima@gmail.com
 */

// Definição da classe PessoaJuridica, que herda de Pessoa
public class PessoaJuridica extends Pessoa {
    // Atributo específico para PessoaJuridica
    private String cnpj;

    // Construtor
    public PessoaJuridica(String nome, String endereco, String cnpj) {
        super(nome, endereco);
        this.cnpj = cnpj;
    }

    // Método getter para cnpj
    public String getCnpj() {
        return cnpj;
    }

    // Método setter para cnpj
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    // Sobrescrita do método imprimirDetalhes para incluir informações específicas de PessoaJuridica
    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("CNPJ: " + cnpj);
    }
}
