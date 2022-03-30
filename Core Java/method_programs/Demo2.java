package method_programs;

class Demo2 
{
	public static void Car()
	{
		System.out.println("Car is choosen...");
	}
	public void Bike()
	{
		System.out.println("Bike is choosen...");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Demo2 d1 = new Demo2();
		d1.Bike();
		Car();
		System.out.println("main ends");

	}
}
