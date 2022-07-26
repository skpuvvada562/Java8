package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import com.java8.pojo.Employee;

public class StreamFilter8 {

	public static void main(String[] args) {
		//if we want to filter elements from the collection based on some boolean condition then we should go for filter concept
		//we can configure filter by filter() method of stream interface
		//public Stream filter(Predicate<T> t) argument is can be boolean valued function or -> expression (lambda)
		//ex: c.stream().filter(i->i%2==0)
		List<Integer> list=Arrays.asList(0,10,5,20,15,25,30);
		List<Integer> filterList=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		Consumer<List> conList=l->System.out.println("even numbers==="+l);
		conList.accept(filterList);
		
		
		List<Employee> empList=Arrays.asList(
				new Employee(2l,"Mamatha",30),
				new Employee(1l,"Sandeep",34),
				new Employee(3l,"Advaith",3),new Employee(4l,"HarikiranBabu",60));
		
		List<Employee> empFilter=empList.stream().filter(e->e.getAge()<30).collect(Collectors.toList());
		System.out.println("filtering the employee==="+empFilter);
	}
}
