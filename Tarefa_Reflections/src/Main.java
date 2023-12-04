/**
 * @author pmpedrolima@gmail.com
 */
public class Main {
    @Tabela(nome = "Table")
    public static class MinhaClasse {
    }

    public static void main(String[] args) {
        // Obtém a classe
        Class<?> classe = MinhaClasse.class;

        // Verifica se a annotation está presente na classe
        if (classe.isAnnotationPresent(Tabela.class)) {
            // Obtém a instância da annotation
            Tabela tabelaAnnotation = classe.getAnnotation(Tabela.class);

            // Obtém o valor do elemento "nome" na annotation
            String nomeDaTabela = tabelaAnnotation.nome();

            System.out.println("Nome da tabela: " + nomeDaTabela);
        } else {
            System.out.println("A annotation Tabela não está presente na classe.");
        }
    }
}