package com.test.swarm.batch;

import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.wildfly.swarm.Swarm;
import org.wildfly.swarm.jaxrs.JAXRSArchive;

public class InitApplication {

    public static void main(String[] args) throws Exception {

        Swarm swarm = new Swarm();

        JAXRSArchive jaxrsArchive = ShrinkWrap.create(JAXRSArchive.class);
        jaxrsArchive.addPackage("com.test.swarm.batch");

        jaxrsArchive.addAllDependencies();

        swarm.start();
        swarm.deploy(jaxrsArchive);

    }

}
