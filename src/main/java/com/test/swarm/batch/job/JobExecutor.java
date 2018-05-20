package com.test.swarm.batch.job;

import java.util.Properties;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.ejb.Asynchronous;
import javax.enterprise.context.Dependent;

@Dependent
public class JobExecutor {

	@Asynchronous
	public Long execute() {
		
		JobOperator jobOperator = BatchRuntime.getJobOperator();
		Properties params = new Properties();

		long jobExecutionId = jobOperator.start("jobText", params);
		return jobExecutionId;
		
	}
	
}
