package com.alg.dp.project15.solution2;

import java.util.List;


public class ListView extends AbstractView {

	public ListView(List<Task> tasks) {
		super(tasks);
	}
	public void formattedDisplay() {
		for(Task task:tasks) {
			System.out.println("-" + task.toString());
		}

	}

}
