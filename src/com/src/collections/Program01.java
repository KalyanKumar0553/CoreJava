package com.src.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.Set;

class Emp {
	int id;

	public Emp(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return (this.id);
	}
}

public class Program01 {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> data = new LinkedHashMap();
		data.put("a", 1);
		data.put("d", 4);
		data.put("c", 3);
		data.put("b", 2);
		System.out.println(data);
		Set<Entry<String, Integer>> entries = data.entrySet();
		List<Entry<String, Integer>> values = new ArrayList();
		values.addAll(entries);
		Collections.sort(values,new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
			
		});
		data.clear();
		values.stream().forEach(e->{
			data.put(e.getKey(), e.getValue());
		});
		System.out.println(data);
	}

	public static void add() {
		List<String> data = new ArrayList<>();
		data.add("a");
		data.add("e");
		data.add("i");
		for (int i = 0; i < data.size(); i++) {
			String a = data.get(i);
			if (a.indexOf("a") > -1) {
				data.remove(a);
			}
		}
		System.out.println(data);
	}

	public static void add1() {
		List<String> data = new ArrayList<>();
		data.add("a");
		data.add("e");
		data.add("i");
		for (String a : data) {
			if (a.indexOf("a") > -1) {
				data.remove(a);
			}
		}
		System.out.println(data);
	}
}
