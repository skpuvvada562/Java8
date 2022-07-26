package com.java8.features;

import java.util.function.Function;
import java.util.function.IntFunction;

public class PrimitiveFunction8java {

	public static void main(String[] args) {
		//We should not use this function as there is an performance issue for converting primitive types to wrapper and vice versa. It is doing autoboxing and unboxing
		Function<Integer,Integer> fun=i-> i*i;
		System.out.println(fun.apply(4));
		
		IntFunction<Integer> intFun=i->i*i;
		System.out.println(intFun.apply(5));
		
		//Primitive Function types
			//IntFunction --> Can take int type as input and return object(any type)
			//DoubleFunction --> Can take double type as input and return object(any type)
			//LongFunction --> Can take long type as input and return object(any type)
			//DoubleToIntFunction -> Can take double type as input and return int type
		 		//method: int applyAsInt(double value)
			//DoubleToLongFunction --> input type: double
									 //return type: long
		 							 //method: applyAsLong(double value)
			//IntToDoubleFunction --> input type: int 
									//return Double 
									//Method: applyAsDouble(int value)
			//IntToLongFunction --> input type: int
									//return Long
									//applyAsLong(int value)
			//LongToDoubleFunction -->input type:long
									//return Long //applyAsDouble(long value)
			//LongToIntFunction -->input type:long
									//return Long //applyAsInt(long value)
		
			//ToIntFunction -->input type is anything
							   //return int , applyAsInt(T t)
		    //ToLongFunction -->input type is anything
		   						//return long , applyAsInt(T t)
			//ToDoubleFunction-->input type is anything
								//return double , applyAsInt(T t)
			//ToIntBiFunction --> input type is anything // return type must be Int applyAsInt(T t,V v)
			//ToLongBiFunction --> input type is anything // return type must be long applyAsInt(T t,V v)
			//ToDoubleBiFunction --> input type is anything // return type must be double applyAsInt(T t,V v)
		
	}
}
