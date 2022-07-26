package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.java8.pojo.Employee;


public class Predicate8Java {
	
	public  boolean test(Integer i) {
		if(i%2==0)
			return true;
		else 
			return false;
	}

	// Predicate is for conditional checks where ever we need to check statement return boolean we use Predicate
	// public abstract boolean test(T t)
	
	//Predicate always takes the input type and returns Boolean ex: Predicate<T> ---> boolean
	public static void main(String[] args) {
		
		Predicate8Java pre=new Predicate8Java();
		System.out.println("Normal method::"+pre.test(12));
		Predicate<Integer> isEven=i->i%2==0;  // above test method we can replace with this Predicate functionality  
		System.out.println("===="+isEven.test(4)+"======"+isEven.negate().test(4));
		
		Predicate<Employee> empPred=e->e.getAge()>10 || e.getName().equals("sandeep");
		System.out.println("is sandeep age is more than 30::"+empPred.test(new Employee(1l,"sandeep",35)));
		
		List<Employee> empList=Arrays.asList(
				new Employee(2l,"Mamatha",30),
				new Employee(1l,"Sandeep",34),
				new Employee(3l,"Advaith",3));
		
		//if age>3 return false
		
		Predicate<Employee> epr=e->e.getAge()<=3;
		for(Employee e:empList) {
			if(epr.test(e))
				System.out.println("==="+e.getName());
		}
		
		// If requirement has 2 predicates example
		// (Predicate) p1 --> to check whether the number is even or not
		// (Predicate) p2 --> to check whether the number is > 10 or not
		// p1.and(p2).test(20)
		
		Predicate<Integer> p1=i->i%2==0;
		Predicate<Integer> p2=i->i>10;
		System.out.println("both predicate satisfies::"+p1.and(p2).test(20));
		System.out.println("both predicate not satisfies::"+p1.and(p2).test(5));
		System.out.println("or condition one predicate satisfies which is even::"+p1.or(p2).test(4));
		
		Predicate<List<String>> childCoveredPerson=cp->cp.contains("C");
		
		List<String> cpRelation=Arrays.asList("Insured","C");
		
		System.out.println("===="+childCoveredPerson.test(cpRelation));
		
		//BiPredicate
		//BiPredicate is exactly same as predicate but it takes 2 input parameters and perform condition checks and return boolean
		
		BiPredicate<List<Employee>,Employee> biP=(eList,e2)->{
			for(Employee emp:eList) {
				if(emp.getAge()==e2.getAge()) {
					return true;
				}
			}
			
			return false;
		};
		
		System.out.println("Advaith age is correct==="+biP.test(empList, new Employee(3l,"Advaith",3)));
		System.out.println("Advaith age is correct==="+biP.test(empList, new Employee(3l,"Advaith",2)));
		
	}
}
