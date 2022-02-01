class Demo1 
{
	public static int a = 10;
	public static int b = 30;
	public  int c = 40;
	public int d = 50;
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		System.out.println(a);
		System.out.println(b);
		Demo1 d1 = new Demo1();
		System.out.println(d1.c);
		System.out.println(d1.d);
		System.out.println("main ends");
	}
}
