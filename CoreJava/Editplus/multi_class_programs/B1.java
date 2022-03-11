class A
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
		A.Hello();
		A a1 = new A();
		a1.Hi();
		System.out.println("main ends!");
	}
}
