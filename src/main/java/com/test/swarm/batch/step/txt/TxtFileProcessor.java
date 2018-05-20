package com.test.swarm.batch.step.txt;

import javax.batch.api.chunk.ItemProcessor;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class TxtFileProcessor implements ItemProcessor {

	@Override
	public Object processItem(Object item) throws Exception {
		
		System.out.println("Processor item: " + item);
		
		return item;
	}

}
