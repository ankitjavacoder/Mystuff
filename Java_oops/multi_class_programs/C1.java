class A
{
	public static void Hello()
	{
		System.out.println("Hello begins");
		System.out.println("Hello ends");

	}
	public void Hi()
	{
		System.out.println("Hi begins");
		Hello();
		System.out.println("Hi begins");

	}
}
class B
{
	public static int a = 10;
	public int b = 20;
	public static void HelloAgain()
	{
		System.out.println("Hello Again begins");
		B b1 = new B();
		b1.HiAgain();
		System.out.println("Hello Again ends");
	}
	public  void HiAgain()
	{
		System.out.println("Hi Again begins");
		System.out.println(a);
		System.out.println(b);
		System.out.println("Hi Again ends");
	}
}
class C1 
{
	public static void main(String[] args) 
	{
		System.out.println("maib begins!");
		A a1 = new A();
		a1.Hi();
		B.HelloAgain();
		System.out.println("maib ends!");
	}
}
