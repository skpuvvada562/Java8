package com.java8.features;

import java.util.function.BooleanSupplier;

public class PrimitiveSupplier8java {
	public static void main(String[] args) {
		
		BooleanSupplier bsup=()-> Boolean.TRUE;
		System.out.println(bsup.getAsBoolean());
		
		//IntSupplier  int getAsInt()
		//LongSupplier long getAsLong()
		//DoubleSupplier double getADouble()
	}

}
