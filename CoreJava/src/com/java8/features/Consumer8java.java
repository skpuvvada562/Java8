package com.java8.features;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java8.pojo.Employee;

public class Consumer8java {

	public static void main(String[] args) {

		//Consumer always take Input value and return void Ex: Consumer<T> --- void
		
		Consumer<String> c=s->System.out.println(s);
		c.accept("Sandeep");
		
		Consumer<Employee> empCon=e->{
			if("Sandeep".equals(e.getName())) {
				e.setAge(55);
				System.out.println(e);
			}
		};
		empCon.accept(new Employee(1l,"Sandeep",30));
		
		List<Employee> empList=Arrays.asList(new Employee(1l,"Kiran",62),new Employee(1l,"Laxman",60),new Employee(1l,"Sai",58));
		Predicate<Employee> empPre=e->e.getAge()>58;
		Consumer<Employee> conEmp=e->{
			System.out.println("==name=="+e.getName()+"===age=="+e.getAge());
		};
		for(Employee e :empList) {
			
			if(empPre.test(e)) {
				conEmp.accept(e);
			}
		}
		
		//Consumer Chaining
		
		Consumer<Employee> con=e->System.out.println("i am consumer name=="+e.getName());
		Consumer<Employee> con1=e->System.out.println("i am consumer age=="+e.getAge());
		con.andThen(con1).accept(new Employee(1l,"Vijaya",58));
		
		//BiConsumer
		
		List<Employee> empList1=new CopyOnWriteArrayList<>();
		empList1.add(new Employee(2l,"Mamatha",30));
		empList1.add(new Employee(1l,"Sandeep",34));
		empList1.add(new Employee(3l,"Advaith",3));
		BiConsumer<List<Employee>,Employee> biCon=(elist,e)->{
			elist.forEach(e1->{
				if(!e1.getName().equals(e.getName())) {
					elist.add(e);
				}
			});
			System.out.println("Biconsumer==="+elist);
		};
		biCon.accept(empList1, new Employee(4l,"Vijaya",56));
	}

}
