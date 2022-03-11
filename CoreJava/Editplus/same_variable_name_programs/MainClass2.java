class student
{
	public String sName;
	public String Stream;
	public int age;
	public double tenth;
	public double inter;
	public double degree;
	public void setData(String sname, int agey, double ssc, double intr, double deg, String strng ){
		sName = sname;
		Stream = strng;
		age = agey;
		tenth = ssc;
		inter = intr;
		degree = deg;
		}
	public void studentInfo()
	{
		System.out.println("-------------*****------------");
		System.out.println("Student Name : "+ sName);
		System.out.println("Age : "+ age);
		System.out.println("Tenth Marks : "+ tenth);
		System.out.println("Intermediate Marks : "+ inter);
		System.out.println("Degree Marks : "+ degree);
		System.out.println("Stream : "+ Stream);
	}
}
class MainClass3 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts!");
		student s1= new student();
		student s2= new student();
		s1.setData("Rohit", 22,78.0,70.2, 68.5,"Civil");
		s2.setData("Priyanka",22,93.0,78.2,69.0,"ECE");
		s1.studentInfo();
		s2.studentInfo();
		System.out.println("main ends!");
	}
}
