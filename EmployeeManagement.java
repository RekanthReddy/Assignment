import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
	public static void main(String[] args) {
		// 1. Create Employee objects
		Employee emp1 = new Employee(101, "Alice Smith", 50000.0);
		Employee emp2 = new Employee(102, "Bob Johnson", 60000.0);
		Employee emp3 = new Employee(103, "Charlie Brown", 55000.0);

		// 2. Store them in a list
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(emp1);
		employeeList.add(emp2);
		employeeList.add(emp3);

		// 3. Display their details
		for (Employee employee : employeeList) {
			employee.displayDetails();
		}

		// Example of using getters and setters.
		emp1.setSalary(55000.0);
		System.out.println("Updated Salary of employee 101");
		employeeList.get(0).displayDetails();

	}
}
