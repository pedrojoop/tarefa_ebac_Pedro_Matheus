package service;

public class ServiceContract implements IServiceContract {
    private IServiceContract contractDao;

    public ServiceContract(IServiceContract dao) {
        this.contractDao = dao;
    }

    @Override
    public String save() {
        contractDao.save();
        return "Sucesso";
    }

    // Implementação dos métodos adicionados
    @Override
    public Object buscar(int id) {
        return contractDao.buscar(id);
    }

    @Override
    public void excluir(int id) {
        contractDao.excluir(id);
    }

    @Override
    public void atualizar(int id, Object contrato) {
        contractDao.atualizar(id, contrato);
    }
}