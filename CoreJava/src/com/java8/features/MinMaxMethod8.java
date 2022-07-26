package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxMethod8 {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(20,4,10,30,12);
	Optional<Integer> minValue=list.stream().min((i1,i2)->i1.compareTo(i2));
	if(minValue.isPresent())
		System.out.println(minValue.get());
	Optional<Integer> maxValue=list.stream().min((i1,i2)->i2.compareTo(i1));
	if(maxValue.isPresent())
		System.out.println(maxValue.get());
}
}
