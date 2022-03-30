package multi_class_programs;

class A3
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
class B3
{
	public static int a = 10;
	public int b = 20;
	public static void HelloAgain()
	{
		System.out.println("Hello Again begins");
		B3 b1 = new B3();
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
		A3 a1 = new A3();
		a1.Hi();
		B3.HelloAgain();
		System.out.println("maib ends!");
	}
}
