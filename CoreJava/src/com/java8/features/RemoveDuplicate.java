package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.java8.pojo.Employee;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// duplicate String/Integer records removed

		List<String> list1 = Arrays.asList("Sandeep", "Advaith", "Mamatha", "Sandeep");
		
		list1=list1.stream().distinct().collect(Collectors.toList());
		System.out.println("Remove duplicate string ::"+list1);
		
		List<Integer> integerList=Arrays.asList(1,2,1,3,4,3,4);
		integerList=integerList.stream().distinct().collect(Collectors.toList());
		System.out.println("Remove integer duplicate records::"+integerList);
		

		List<Employee> empList=Arrays.asList(
				new Employee(1l,"Mamatha",30),
				new Employee(1l,"Sandeep",34),
				new Employee(3l,"Advaith",3));
		
		empList=empList.stream().distinct().collect(Collectors.toList());
		System.out.println("Remove duplicate records from employee::"+empList);
		
		String s = "ABBCADDAEEB";
		// ACAAB
		// ACB
		removeDulicate(s);
		
	}
	private static void removeDulicate(String s) {
		StringBuilder sb = new StringBuilder();
		String finalValue = s;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (i == 0)
				sb.append(c);
			else {
				if ((i != s.length() - 1) && (s.charAt(i) == s.charAt(i + 1) || s.charAt(i) == s.charAt(i - 1))) {
					continue;
				} else {
					sb.append(c);
				}
			}
		}
		if (!finalValue.equals(sb.toString()))
			removeDulicate(sb.toString());

		else
			System.out.println("remove duplicates from string:::"+sb.toString());
	}
}
