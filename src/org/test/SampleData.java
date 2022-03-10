package org.test;


import java.util.*;
import java.util.Map.Entry;
public class SampleData {

	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.setId(100);
		e.setName("java");
		
		Employee e1=new Employee();
		e1.setId(300);
		e1.setName("selenium");
		
		List<Employee> l=new ArrayList<>();
		
		l.add(e);
		l.add(e1);
		
		for (int i = 0; i <l.size(); i++) {
			
			System.out.println(l.get(i).getId());
			System.out.println(l.get(i).getName());
		}
		
		
		System.out.println("=========================");
		
		Set<Employee> s=new HashSet<>();
		
		s.add(e);
		s.add(e1);
		
		for (Employee employee : s) {
			
			System.out.println(employee.getId());
			System.out.println(employee.getName());
			
			
		}
		
		System.out.println("========================");
		
		Map<Integer,Employee> m=new HashMap<>();
		
		m.put(1,e);
		m.put(2,e1);
		
		Set<Entry<Integer,Employee>> entryset=m.entrySet();
		
		for (Entry<Integer, Employee> entry : entryset) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getId());
			System.out.println(entry.getValue().getName());
		}
		
	}
}
