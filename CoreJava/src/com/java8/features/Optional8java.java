package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optional8java {

	public static void main(String[] args) {

		List<String> list=Arrays.asList("Sandy","Mammu","Advaith","Xyz","AdvaithRam");
		Optional<String> opt=list.stream().filter(s->s.equals("AdvaithRam")).findAny();
		if(opt.isPresent())
			System.out.println(opt.get());
		
	}

}
