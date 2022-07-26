package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.pojo.Employee;

public class StreamMap8java {

	public static void main(String[] args) {
		//Mapping -> if we want to create a separate new object for every object present in the collection based on some function then we should go for mapping
		//We can implement mapping by using map() method of Stream interface
		//public Stream map(Function<T,R> f)
		//ex: Stream s1=c.stream().map(i->i*2)
		

		List<Integer> list=Arrays.asList(0,10,5,20,15,25,30);
		
		List<Integer> list2=list.stream().map(i->i*2).collect(Collectors.toList());
		System.out.println(list2);
		

		List<Employee> empList=Arrays.asList(
				new Employee(2l,"Mamatha",30),
				new Employee(1l,"Sandeep",34),
				new Employee(3l,"Advaith",3),new Employee(4l,"HarikiranBabu",60));
		
	}
}
