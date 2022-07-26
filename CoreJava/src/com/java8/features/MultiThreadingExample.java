package com.java8.features;

public class MultiThreadingExample {

	public static void main(String[] args) {
		Runnable r=()->{
			for(int i=0;i<10;i++) {
				System.out.println("Child Thread");
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++) {
			System.out.println("Main thread");
		}
		
		Runnable r1=new Runnable() {

			@Override
			public void run() {
				System.out.println("I am anonymous inner class");
				
			}
			
			
			
		};
		
		Thread t1=new Thread(r1);
		t1.start();
		
		Thread t2=new Thread(()->{
			
		System.out.println("I am lambda expression inner class");
			}) ;
		t2.start();
		
	}
		
}
