package com.java8.features;

import java.util.HashMap;
import java.util.Map;

public class LoopMap {

	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<>();
		map.put("HR", 5);
		map.put("Admin", 3);
		map.put("Finance", 2);
		
		map.forEach((k,v)->{
			System.out.println("key::"+k+", value::"+v);
			if("HR".equals(k))
				System.out.println(map.get(k));
		});
		
		/*map.stre*/
		
	}


	
}
