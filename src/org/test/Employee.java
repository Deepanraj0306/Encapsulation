package org.test;

public class Employee {
	
	
	private int id;
	
	private String name;
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		
		Employee e=new Employee();
		
		e.setId(100);
		e.setName("java");
		System.out.println(e.getId());
		System.out.println(e.getName());
		
	}

}
