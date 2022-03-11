package multi_class_programs;

class A2
{
	public static int a = 10;
	public int b = 20;
}
class B2
{
	public static void Hello()
	{
		System.out.println("Hello begins");
		System.out.println(A.a);
		System.out.println("Hello ends");
	}
		public  void Hi()
	{
		System.out.println("Hi begins");
		A a1 = new A();
		System.out.println(a1.b);
		System.out.println("Hi ends");
	}
}
class C 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		B2.Hello();
		B2 b1 = new B2();
		b1.Hi();
		System.out.println("main ends");
	}
}
