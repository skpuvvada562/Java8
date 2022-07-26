package com.java8.features;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.java8.function.Addition;
import com.java8.function.Subtraction;
import com.java8.function.Test;
import com.java8.pojo.Employee;

public class LamdaExpression {
	
	protected static final Map<String,String> paymentTypeMap=Stream.of(new String[] [] {
		{"CH","C"},{"PA","P"},{"ET","E"}
	}).collect(Collectors.toMap(keyMapper ->keyMapper[0], valueMapper->valueMapper[1]));
	
	public static void main(String[] args) {
		
		Test t=()->System.out.println("Welcome home");
		t.m1();
		
		Addition ad=(a,b)->a+b;
		int value=ad.add(5, 2);
		System.out.println("sum of two numbers ::"+value);
		
		Subtraction sub = (c,d)->c-d;
		int result=sub.subtract(5, 7);
		
		System.out.println("subtract of two numbers ::"+result);
		Employee emp =new Employee("Sandeep","Technical Arcitect");
		Predicate<Employee> pre=(Employee e) -> "Sandeep".equals(e.getName());
		System.out.println("employee name exists ==="+pre.test(emp)+", employee name not exists::"+pre.negate().test(emp));
		
		paymentTypeMap.forEach((k,v)->{
			if("CH".equals(k)) {
				System.out.println(v);
			}
		});
	}

}
