package dao;

public interface IContractDao {
    void salvar();

    //TODO
    //Fazer métodos de buscar, excluir e atualizar

    // Métodos adicionados
    Object buscar(int id);
    void excluir(int id);
    void atualizar(int id, Object contrato);

    void atualizar(int id, Contract contrato);
}
