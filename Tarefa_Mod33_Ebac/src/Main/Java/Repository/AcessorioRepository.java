package Main.Java.Repository;

import Main.Java.domain.Acessorio;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityTransaction;
import java.util.List;

/**
 * @author pmpedrolima@gmail.com
 */
public class AcessorioRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Acessorio obterAcessorioPorId(Long id) {
        return entityManager.find(Acessorio.class, id);
    }

    public List<Acessorio> listarAcessorios() {
        return entityManager.createQuery("SELECT a FROM Acessorio a", Acessorio.class).getResultList();
    }

    public void salvarAcessorio(Acessorio acessorio) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(acessorio);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        }
    }

    public void deletarAcessorio(Long id) {
        Acessorio acessorio = obterAcessorioPorId(id);
        if (acessorio != null) {
            EntityTransaction transaction = entityManager.getTransaction();
            try {
                transaction.begin();
                entityManager.remove(acessorio);
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

