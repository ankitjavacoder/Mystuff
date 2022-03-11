package JavabeanClass;

public class Employee {
	private int id;
	private String employee;
	private double salary;
	public Employee(int id, String employee, double salary) {
		this.id = id;
		this.employee = employee;
		this.salary = salary;
	}
	public String getEmployee() {
		return employee;
	}
	public void setEmployee(String employee) {
		this.employee = employee;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
}
