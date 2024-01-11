package com.pedro.projetoMod38.repository;

import com.pedro.projetoMod38.domain.Carro;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * @author pmpedrolima@gmail.com
 */

public class CarroRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public void salvar(Carro carro) {
        entityManager.persist(carro);
    }

    public Carro findById(String id) {
        Carro carro = entityManager.find(Carro.class, id);
        return carro;
    }

    public List<Carro> findAll() {
        List<Carro> carros = entityManager.createQuery("from Carro", Carro.class).getResultList();
        return carros;
    }

    public void excluirCarro(String id) {
        Carro carro = entityManager.find(Carro.class, id);
        entityManager.remove(carro);
    }

    public void editarCarro(String id, Carro carro) {
        entityManager.merge(carro);
    }

    public List<Carro> findCar(String modelo, String marca) {
        String jpql = "SELECT c FROM Carro c WHERE c.modelo = :modelo AND c.marca = :marca";
        Query query = entityManager.createQuery(jpql, Carro.class);
        query.setParameter("modelo", modelo);
        query.setParameter("marca", marca);

        return query.getResultList();
    }
}


