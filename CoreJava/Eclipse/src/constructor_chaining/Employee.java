package constructor_chaining;

public class Employee {
	public int id;
public String Name;
public double salary;
public Employee(int id, String Name, double salary) {
	this.id = id;
	this.Name = Name;
	this.salary = salary;
}
public void Display() {
	System.out.println("ID : "+ id);
	System.out.println("Name : "+ Name);
	System.out.println("Salary : "+ salary);
}
}
