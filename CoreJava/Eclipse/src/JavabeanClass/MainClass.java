package JavabeanClass;

public class MainClass {

	public static void main(String[] args) {
		Employee e1 = new Employee(12, "raja", 23000.2);
		System.out.println(e1.getEmployee());
		System.out.println(e1.getId());
		System.out.println(e1.getSalary());
		System.out.println("Hike is provided");
		e1.setSalary(31000.0);
		System.out.println("Updated salary :" + e1.getSalary());
	}

}
