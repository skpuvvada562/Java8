package com.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapSVFlatMap {

	/*
	 * Stream api has both map() and flatMap() methods and both have intermediate stream operation and return another stream as method output.
	 * Both of the function map() and flatMap() are used for transformation and mapping operations. 
	 * map() function produces one output for one input value whereas flatMap() function produces an arbitary number of values as output. 
	 * i.e zero or more than zero for each input value
	 * file:///D:/TrustMark/workspace/JavaPreparation/June_8_2022/CoreJava/src/com/java8/features/mapvsflatmap.png
	 * 
	 */
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("Sandy","Mamatha","AdvaithRam","Harikiran","Vijaya");
		List<Integer> convertedList=list.stream().map(s->s.length()).collect(Collectors.toList());
		System.out.println("==map example=="+convertedList);
		List<String> list1=Arrays.asList("Sandy","Mamatha","AdvaithRam");
		List<String> list2=Arrays.asList("Harikiran","Vijaya");
		List<List<String>> finalList=new ArrayList<>();
		finalList.add(list1);
		finalList.add(list2);
		System.out.println("final list==="+finalList);
		
		List<String> flatMapList=finalList.stream().flatMap(e->e.stream()).collect(Collectors.toList());
		System.out.println("final map==="+flatMapList);
		
		
		
	}
}
