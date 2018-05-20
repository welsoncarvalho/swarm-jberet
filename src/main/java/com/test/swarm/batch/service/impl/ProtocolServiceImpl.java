package com.test.swarm.batch.service.impl;

import com.test.swarm.batch.model.Protocol;
import com.test.swarm.batch.repository.ProtocolRepository;
import com.test.swarm.batch.service.ProtocolService;

import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import java.util.List;

@Dependent
public class ProtocolServiceImpl implements ProtocolService {

    @Inject
    private ProtocolRepository protocolRepository;

    public List<Protocol> list() {
        return protocolRepository.list();
    }
}
