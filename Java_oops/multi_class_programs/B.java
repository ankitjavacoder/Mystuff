class A
{
	public static int a = 10;
	public int b = 20;
}
class B 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts!");
		System.out.println(A.a);
		A a1 = new A();
		System.out.println(a1.b);
		System.out.println("main ends!");
	}
}
