package com.test.swarm.batch.resource;

import com.test.swarm.batch.job.JobExecutor;
import com.test.swarm.batch.model.Protocol;
import com.test.swarm.batch.service.ProtocolService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("execution")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ExecutionResource {

    @Inject
    private ProtocolService protocolService;
    
    @Inject
    private JobExecutor jobExecutor;

//    @GET
    public Response getMsg() {
        List<Protocol> protocols = protocolService.list();
        return Response.ok().entity(protocols).build();
    }

    @GET
    public Response execute() {
    	Long executionId = jobExecutor.execute();
    	return Response.ok().entity(executionId).build();
    }
}
