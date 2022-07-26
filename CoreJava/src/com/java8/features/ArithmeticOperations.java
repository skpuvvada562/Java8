package com.java8.features;

import java.util.function.Function;
import java.util.function.Predicate;

public class ArithmeticOperations {

	public static Integer square(int i) {
		return i*i;
	}
	public static void main(String[] args) {
		
		System.out.println("==before java 8=="+square(5));
		
		//In Java 8
		
		Function<Integer,Integer> mul=i->i*i;
		Function<Integer,Integer> add=i->i+i;
		System.out.println("===java 8 multiply===="+mul.apply(9));
		System.out.println("===java 8 adddition===="+add.apply(8));
		
		//input is an even number or not
		
		Predicate<Integer> pre=i->i%2==0;
		
		System.out.println("is even number::"+pre.test(4));
		System.out.println("is odd number::"+pre.test(5));
		
		
	}
}
