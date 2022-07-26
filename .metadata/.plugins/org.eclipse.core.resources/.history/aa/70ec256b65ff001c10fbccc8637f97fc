package com.java8.pojo;

public class Employee {

	private Long id;
	private String name;
	private int age;
	private String designation;

	// constructors
	public Employee() {
		initialize();
	}

	/**
	 * Constructor for primary key
	 */
	public Employee(Long id) {
		this.setId(id);
		initialize();
	}

	public Employee(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}

	protected void initialize() {
	}

	public Employee(Long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}


	private int hashCode = Integer.MIN_VALUE;

	@Override
	public boolean equals(Object obj) {
		if (null == obj)
			return false;
		if (!(obj instanceof Employee))
			return false;
		else {
			Employee employ = (Employee) obj;
			if (null == this.getId() || null == employ.getId())
				return false;
			else
				return (this.getId().equals(employ.getId()));
		}
	}

	@Override
	public int hashCode() {
		if (Integer.MIN_VALUE == this.hashCode) {
			if (null == this.getId())
				return super.hashCode();
			else {
				String hashStr = this.getClass().getName() + ":" + this.getId().hashCode();
				this.hashCode = hashStr.hashCode();
			}
		}
		return this.hashCode;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", designation=" + designation + ", hashCode="
				+ hashCode + "]";
	}

	

}
