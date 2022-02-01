class CalculateSalary
{
	public static int Salary = 20000;
	public static String jobTitle = "HR";
	public String employeeName;
	public String companyName;
public void calcSalary() {
	System.out.println("---------*****---------");
	System.out.println("Employee Name : "+ employeeName);
	System.out.println("Company Name : "+ companyName);
	System.out.println("Salary per month : " + Salary +" Rs");
	System.out.println("Salary per Annum : "+ (Salary*12) + " Rs");
}
}
class MainClass1 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
			CalculateSalary e1 = new CalculateSalary();
			CalculateSalary e2 = new CalculateSalary();
			e1.employeeName = "Dinga";
			e1.companyName = "HCL";
			e2.employeeName = "Dingi";
			e2.companyName = "Capgemini";
			e1.calcSalary();
			e2.calcSalary();
		System.out.println("main ends");}
}
