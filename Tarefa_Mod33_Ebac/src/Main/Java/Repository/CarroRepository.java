package Main.Java.Repository;

import Main.Java.domain.Carro;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityTransaction;
import java.util.List;

/**
 * @author pmpedrolima@gmail.com
 */
public class CarroRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Carro obterCarroPorId(Long id) {
        return entityManager.find(Carro.class, id);
    }

    public List<Carro> listarCarros() {
        return entityManager.createQuery("SELECT c FROM Carro c", Carro.class).getResultList();
    }

    public void salvarCarro(Carro carro) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(carro);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        }
    }

    public void deletarCarro(Long id) {
        Carro carro = obterCarroPorId(id);
        if (carro != null) {
            EntityTransaction transaction = entityManager.getTransaction();
            try {
                transaction.begin();
                entityManager.remove(carro);
                transaction.commit();
            } catch (Exception e) {
                if (transaction != null && transaction.isActive()) {
                    transaction.rollback();
                }
                throw e;
            }
        }
    }
}

