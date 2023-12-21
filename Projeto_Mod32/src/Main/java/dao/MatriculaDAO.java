package Main.java.dao;

import Main.java.domain.Curso;
import Main.java.domain.Matricula;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MatriculaDAO implements IMatriculaDAO{

    private Matricula matricula;

    @Override
    public Matricula cadastrar(Matricula mat) {
            EntityManagerFactory entityManagerFactory =
                    Persistence.createEntityManagerFactory("ExemploJPA");
            EntityManager entityManager = entityManagerFactory.createEntityManager();

            entityManager.getTransaction().begin();
            entityManager.persist(matricula);
            entityManager.getTransaction().commit();

            entityManager.close();
            entityManagerFactory.close();

            return matricula;
    }

    @Override
    public Matricula buscarPorCodigo(String codigo) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        matricula = entityManager.find(Matricula.class, codigo);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return matricula;
    }

    @Override
    public Matricula atualizarMatricula(Matricula mat) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.merge(matricula);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return matricula;
    }

    @Override
    public String excluirMatricula(Matricula mat) {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("ExemploJPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.remove(matricula);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();

        return "Excluído com sucesso!" + matricula.getCodigo();
    }
}
