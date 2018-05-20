package com.test.swarm.batch.step.txt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.batch.api.chunk.AbstractItemReader;
import javax.enterprise.context.Dependent;
import javax.inject.Named;

@Named
@Dependent
public class TxtFileReader extends AbstractItemReader {

	private Iterator<String> items;
	
	@PostConstruct
	public void init() {
		List<String> values = new ArrayList<>();
		values.add("String1");
		values.add("String2");
		
		this.items = values.iterator();
	}
	
	@Override
	public Object readItem() throws Exception {
		
		while (items.hasNext()) {
			return items.next();
		}
		
		return null;
	}

}
