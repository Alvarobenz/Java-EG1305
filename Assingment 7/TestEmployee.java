import java.util.*;

public class TestEmployee {
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		Employee John = new Employee();
		Employee Jane = new Employee();
		Employee Brian = new Employee();
		
		employeeList.add(John);
		employeeList.add(Jane);
		employeeList.add(Brian);
		
		setEmployee(employeeList.get(0), "John Doe" , 123, 65145.56);
		setEmployee(employeeList.get(1), "Jane Roe" , 456, 78133.79);
		setEmployee(employeeList.get(2), "Brian Black" , 789, 91256.12);
		
		do{
			
		System.out.println("There are " + employeeList.size() + " employees in the payroll system\n");

		for(int i = 0; i < employeeList.size(); i++){
			System.out.println(employeeList.get(i) + " ");
		}
	
		System.out.println("\nThe average salary of the employees is $" + averageSalary(employeeList));
	
		System.out.print("\nAn employee decides to quit his job\n\nEnter the employee id that leaves payroll\n");
		int removeid = scan.nextInt();
		removeEmployee(removeid, employeeList);
		
		
		}while(employeeList.size() > 0);
		
	}
	
		
	public static void setEmployee(Employee employee, String name, int id, double salary) {
		
		employee.setId(id);
		employee.setName(name);
		employee.setSalary(salary);
		
	}
	
	public static double averageSalary(ArrayList<Employee> employeeList){		
		double sum = 0;
		for(int i = 0; i < employeeList.size(); i++){
			 sum += (employeeList.get(i)).getSalary();	
		}
		return sum / employeeList.size();
	}
	
	public static void removeEmployee(int removeid , ArrayList<Employee> employeeList){
		for(int i = 0; i < employeeList.size(); i++){
			if( removeid == ((employeeList.get(i)).getId()) )
				employeeList.remove(i);
		}
	}

}
