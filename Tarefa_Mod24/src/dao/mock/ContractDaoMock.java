package dao.mock;

import dao.Contract;
import dao.IContractDao;

public class ContractDaoMock implements IContractDao {
    @Override
    public void salvar() {

    }

    @Override
    public Object buscar(int id) {
        return null;
    }

    @Override
    public void excluir(int id) {

    }

    @Override
    public void atualizar(int id, Object contrato) {

    }

    @Override
    public void atualizar(int id, Contract contrato) {

    }
}
