package dao;

public class Contract {
    private static int nextId = 1;  // Variável estática para gerar IDs únicos
    private int id;  // ID do contrato
    // Outras propriedades da classe...

    // Construtor da classe
    public Contract() {
        this.id = getNextId();
        // Inicialize outras propriedades, se necessário...
    }

    // Método para obter o ID do contrato
    public int getId() {
        return id;
    }

    private static int getNextId() {
        return nextId++;
    }

    // Outros métodos e propriedades da classe...
}

