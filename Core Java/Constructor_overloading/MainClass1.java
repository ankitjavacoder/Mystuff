package Constructor_overloading;

class Employee1 
{
	public String name;
	public int age;
	public double yoe;
	public double salary;
    public int bonus;
	public Employee1(String n,int a,double s)
	{
		name = n;
		age = a;
		salary=s;
	}
	public Employee1(String n,int a,double s,int b)
	{
		name = n;
		age = a;
		salary=s;
		bonus = b;
	}
	public Employee1(String n,int a,double y,double s)
	{
		name = n;
		age = a;
		yoe=y;
		salary = y;
		
	}
	public Employee1(String n,int a,double y,double s,int b)
	{
		name = n;
		age = a;
		yoe=y;
		salary = y;
		bonus = b;
	}
	
	public  void employeeDetails() 
	{
		System.out.println(".............employeedetails........");
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("years of experience:"+yoe);
		System.out.println("salary:"+salary);
		System.out.println("bouns:"+bonus);
		System.out.println("****************");
	}
}
class MainClass
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Employee1 s1=new Employee1("ahi",25,78.6,56.9);
		Employee1 s2=new Employee1("rai",26,70.6,56.9);
		s1.employeeDetails();
		s2.employeeDetails();
		System.out.println("main ends");
	}
}