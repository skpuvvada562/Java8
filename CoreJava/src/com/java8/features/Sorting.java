package com.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

import com.java8.pojo.Employee;
import com.java8.pojo.PlanComponent;
import com.java8.pojo.ProductComponent;

public class Sorting {

	public static void main(String[] args) {
		List<String> list=Arrays.asList("Sandeep","Advaith","Mamatha");
		list=list.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("Natural sorting Ascending order::"+list);
		list=list.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println("Natural sorting Descending order::"+list);
		
		List<Integer> intList=Arrays.asList(10,5,20,15,30);
		intList=intList.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Integer Natural sorting Ascending order::"+intList);
		
		intList=intList.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("Integer Natural sorting Descending order::"+intList);
		
		
		List<Employee> empList=Arrays.asList(
				new Employee(2l,"Mamatha",30),
				new Employee(1l,"Sandeep",34),
				new Employee(3l,"Advaith",3));
		
		empList=empList.stream().sorted(Comparator.comparing(Employee::getAge).reversed()).collect(Collectors.toList());
		System.out.println("Employee sorting based on age descending order::"+empList);
		empList=empList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
		System.out.println("Employee sorting based on Name ascending order::"+empList);
		
		List<ProductComponent> prodCompList=Arrays.asList(new ProductComponent(3, "ESPRI"), new ProductComponent(1, "EMP"), new ProductComponent(2, "ECHRI"));
		prodCompList=prodCompList.stream().sorted((p1,p2)->p1.getId().compareTo(p2.getId())).collect(Collectors.toList());
		List<PlanComponent> planComList=Arrays.asList(new PlanComponent(3, new ProductComponent(3, "ESPRI")),new PlanComponent(2, new ProductComponent(1, "EMP")),new PlanComponent(1,new ProductComponent(2, "ECHRI")));
		System.out.println("===before===="+planComList);
		planComList=planComList.stream().sorted((p1,p2)->p1.getPc().getId().compareTo(p2.getPc().getId())).collect(Collectors.toList());
		System.out.println("===after===="+planComList);
		
		/*List<ProductComponent> pcList=new ArrayList<>();
		List<PlanComponent> planList=new ArrayList<>();
		Map<List<ProductComponent>,List<PlanComponent>> map=new HashMap();
		planComList.forEach(pc->{
			pcList.add(pc.getPc());
			planList.add(pc);
		});
		map.put(pcList, planList);
		//
		BiFunction<ProductComponent, PlanComponent, List<PlanComponent>> data= (pct,pc)->{
			if(pct.getCode().equals(pc.getPc().getCode())){
				 planList.add(pc);
			}
			return planList;
		};*/
		
		//System.out.println(planList);
	}
}
