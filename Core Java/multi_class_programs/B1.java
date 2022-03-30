package multi_class_programs;

class A1
{
	public static void Hello()
	{
		System.out.println("Hello");
	}
	public void Hi()
	{
		System.out.println("Hi");
	}
}
class B1 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts!");
		A1.Hello();
		A1 a1 = new A1();
		a1.Hi();
		System.out.println("main ends!");
	}
}
