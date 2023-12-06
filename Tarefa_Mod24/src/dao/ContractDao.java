package dao;

import java.util.ArrayList;
import java.util.List;

public class ContractDao implements IContractDao{

    private List<Contract> contracts = new ArrayList<>();

    @Override
    public void salvar() {
        contracts.add(new Contract());
    }

    @Override
    public Contract buscar(int id) {

        for (Contract contract : contracts) {
            if (contract.getId() == id) {
                return contract;
            }
        }
        return null; // Contrato não encontrado
    }

    @Override
    public void excluir(int id) {

        Contract contractParaExcluir = buscar(id);
        if (contractParaExcluir != null) {
            contracts.remove(contractParaExcluir);
        }
    }

    @Override
    public void atualizar(int id, Object contrato) {
        for (int i = 0; i < contracts.size(); i++) {
            if (contracts.get(i).getId() == id) {
                contracts.set(i, (Contract) contrato);
                break;
            }
        }
    }

    @Override
    public void atualizar(int id, Contract contrato) {

    }
}
