package com.java8.features;

interface Left{
	//Purpose of introducing default method is if multiple class implements same interface and if we want to add new method in the interface
	//then all implemented classes should implement this newly added method to over come this we used default method concept then no need to override it 
	
	default void m1() {
		System.out.println("I am in left interface default m1 method");
	}
}

interface Right {
	default void m1() {
		System.out.println("I am in Right interface default m1 method");
	}
}
public class Java8DefaultMethod implements Left,Right{

	public static void main(String[] args) {
		
		Java8DefaultMethod t=new Java8DefaultMethod();
		t.m1();
	}
//if you want to access same default method of an interfaces we should override the interface and using below syntax we can write our own logic or we can use interface default method implementation
	@Override
	public void m1() {
		Left.super.m1(); 
		Right.super.m1();
	}

}
