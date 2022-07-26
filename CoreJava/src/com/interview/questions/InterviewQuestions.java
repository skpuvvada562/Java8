package com.interview.questions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.java8.pojo.Employee;

public class InterviewQuestions {

	public static void main(String[] args) {
		
		//Remove duplicate data from string
		
		String name="Jagan welcome Jagan";
        
        String[] s1=name.split(" ");
        HashSet<String> set=new HashSet<>();
        for(String s:s1) {
        	set.add(s);
        	
        }
        
        System.out.println("remove duplicate from string: "+set);
        
        //GroupBy Employee Designation
        
        List<Employee> empList=Arrays.asList(
        		new Employee("Sandeep", "Technical Architect"),
        		new Employee("Raghavender", "Lead Developer"),
        		new Employee("Rammurthy", "Lead Developer"),
        		new Employee("Anand", "Technical Architect"),
        		new Employee("Jagan", "Senior Software Engineer"));
        
    	Map<String, List<String>> groupByDesignation =empList.stream().collect(
    			Collectors.groupingBy(Employee::getDesignation,Collectors.mapping(Employee::getName, Collectors.toList())));
    	
    	 System.out.println("Group by designation: "+groupByDesignation);
    	 
    	 String s="aababcccdc";
    	//output should be "a3b2c4d1"
    	 
    	 char [] ch=s.toCharArray();
 		StringBuilder sb = new StringBuilder();
 		int count=0;

 		for (int i = 0; i < ch.length; i++) {
 			char c = ch[0];
 			char c1=ch[i];
 			CharSequence cs;
 			if(c==c1) {
 				count++;
 				continue;
 				
 			}
 			sb.append(c).append(count);
 		}
 		System.out.println("char=="+sb.toString());
 	
		
	}

}
