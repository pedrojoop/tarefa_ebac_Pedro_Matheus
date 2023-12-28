package Main.Java.Repository;

import Main.Java.domain.Marca;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.EntityTransaction;
import java.util.List;

/**
 * @author pmpedrolima@gmail.com
 */
public class MarcaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Marca obterMarcaPorId(Long id) {
        return entityManager.find(Marca.class, id);
    }

    public List<Marca> listarMarcas() {
        return entityManager.createQuery("SELECT m FROM Marca m", Marca.class).getResultList();
    }

    public void salvarMarca(Marca marca) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(marca);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            throw e;
        }
    }

    public void deletarMarca(Long id) {
        Marca marca = obterMarcaPorId(id);
        if (marca != null) {
            EntityTransaction transaction = entityManager.getTransaction();
            try {
                transaction.begin();
                entityManager.remove(marca);
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

