class Employee
{
	String name ;
	int age ;
	int salary;
	double yoe;
	int bonus;
	
	public Employee (String a, int b,int c, double d){
		name = a;
		age = b;
		salary = c;
		yoe = d;
	}
	public Employee (String a, int b,int c, double d,int e){
		name = a;
		age = b;
		salary = c;
		yoe = d;
		bonus = e;
	}
	public void EmpInfo(){
		System.out.println("--------*****--------");
		System.out.println("Name : "+ name);
		System.out.println("age : "+ age);
		System.out.println("Salary : "+ salary );
		System.out.println("Years of Experience : "+ yoe + "years");
		System.out.println("Joining Bonus : "+ bonus);
	}
}
class DisplayInfo 
{
	public static void main(String[] args) 
	{
		System.out.println("main Starts ");
		Employee e1 = new Employee("Dinga", 26,29000,0);
		Employee e2 = new Employee("Dingi", 26,29000,3.2,45000);
		e1.EmpInfo();
		e2.EmpInfo();
		System.out.println("main Starts ");
		}
}
9398046628 vijay