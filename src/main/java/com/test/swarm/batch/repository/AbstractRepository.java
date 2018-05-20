package com.test.swarm.batch.repository;

import java.util.List;

public interface AbstractRepository<E, I> {

    E findOne(I id);

    List<E> list();

}
