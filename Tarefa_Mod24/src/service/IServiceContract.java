package service;

public interface IServiceContract {
    String save();

    //TODO
    //Fazer métodos de buscar, excluir e atualizar

    // Métodos adicionados
    Object buscar(int id);
    void excluir(int id);
    void atualizar(int id, Object contrato);

}

