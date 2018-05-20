package com.test.swarm.batch.repository.impl;

import com.test.swarm.batch.model.Protocol;
import com.test.swarm.batch.repository.ProtocolRepository;

import javax.enterprise.context.Dependent;

@Dependent
public class ProtocolRepositoryImpl extends AbstractRepositoryImpl<Protocol, Long> implements ProtocolRepository {
}
