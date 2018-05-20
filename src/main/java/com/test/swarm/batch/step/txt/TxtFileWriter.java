package com.test.swarm.batch.step.txt;

import java.util.List;

import javax.batch.api.chunk.AbstractItemWriter;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class TxtFileWriter extends AbstractItemWriter {

	@Override
	public void writeItems(List<Object> items) throws Exception {
		items.forEach(item -> System.out.println("Writer item: " + item));
	}

}
