package class_object_program.Expert_level_programming;

class CalculateSalary
{
	public static int Salary = 20000;
	public static String jobTitle = "HR";
	public String employeeName;
	public String companyName;
	//Constructor
	public CalculateSalary(String a,String b){
	employeeName = a;
	companyName = b;
	}
public void calcSalary() {
	System.out.println("---------*****---------");
	System.out.println("Employee Name : "+ employeeName);
	System.out.println("Company Name : "+ companyName);
	System.out.println("Salary per month : " + Salary +" Rs");
	System.out.println("Salary per Annum : "+ (Salary*12) + " Rs");
}
}
class Asgmnt1 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
			CalculateSalary e1 = new CalculateSalary("Dinga","HCL");
			CalculateSalary e2 = new CalculateSalary("Dingi", "Capgemini");
			e1.calcSalary();
			e2.calcSalary();
		System.out.println("main ends");}
}
