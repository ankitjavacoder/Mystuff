package class_object_program.Beginner_level;

class student
{
	public String sName;
	public String Stream;
	public int age;
	public double tenth;
	public double inter;
	public double degree;
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
class MainClass1 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts!");
		student s1= new student();
		student s2= new student();
		s1.sName = "Rohit";
		s1.Stream = "Civil";
		s1.age = 22;
		s1.tenth = 72.0;
		s1.inter = 70;
		s1.degree = 68.0;
		s2.sName = "Priyanka";
		s2.Stream = "ECE";
		s2.age = 22;
		s2.tenth = 92.0;
		s2.inter = 88.2;
		s2.degree = 70.2;
		s1.studentInfo();
		s2.studentInfo();
		System.out.println("main ends!");
	}
}
