package com.src.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

class Employee {
	String branch;
	Integer salary;
	public Employee(int salary) {
		this.branch = branch;
		this.salary = salary;
	}
}
class HeightMatch {
	public static final void main(String[] args) {
//		Employee e1 = new Employee("CSE",23);
//		Employee e2 = new Employee("CSE",25);
//		ArrayList<Employee> list = new ArrayList();
//		list.add(e1);
//		list.add(e2);
//		Map<String,List<Employee>> data = list.stream().collect(Collectors.groupingBy(Employee::getBranch));
	}
	
	public static HashMap convertData(String[] input) {
		List<String> data = Arrays.asList(input);
		HashMap<String,Integer> result = new HashMap();
		data.stream().forEach(i-> {
			String partition[] = i.split(",");
			result.put(partition[0], Integer.parseInt(partition[1]));
		});
		System.out.println(result);
		return result;
	}
	
}