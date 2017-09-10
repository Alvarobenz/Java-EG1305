import java.util.*;

public class Employee {
	
	private String name;
	private int id;
	private double salary;
	
	public void Employee(String name1, int id1, double salary1){
		
		name1 = name;
		id1 = id;
		salary1 = salary;
	}
	
	public void setId(int id1){
		id = id1;
	}
	
	public int getId(){
		return id;
	}
	
	public void setName(String name1){
		name = name1;
	}
	
	public String getName(){
		return name;
	}
	
	public void setSalary(double salary1){
		salary = salary1;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public String toString(){
		return "Employee " + name + "'s id is " + id + " and annual salary is $" + salary;
	}
}
