/*
* @author pmpedrolima@gmail.com
 */

// Definição da classe Pessoa
public class Pessoa {
    // Atributos comuns a todas as pessoas
    private String nome;
    private String endereco;

    // Construtor
    public Pessoa(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // Métodos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Método comum a todas as pessoas
    public void imprimirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
    }
}