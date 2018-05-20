package com.test.swarm.batch.repository.impl;

import com.test.swarm.batch.repository.AbstractRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public abstract class AbstractRepositoryImpl<E, I> implements AbstractRepository<E, I> {

    @PersistenceContext(unitName = "batchPU")
    private EntityManager entityManager;

    private Class<E> entityClass;

    @SuppressWarnings("unchecked")
	public AbstractRepositoryImpl() {
        this.entityClass = (Class<E>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public E findOne(I id) {
        return entityManager.find(entityClass, id);
    }

    @SuppressWarnings("unchecked")
	public List<E> list() {
        String hql = "From " + this.entityClass.getSimpleName();
        return entityManager.createQuery(hql).getResultList();
    }

}
