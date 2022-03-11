package execution_process_program;

class Demo2 
{
	public static int a = 10;
	public  int b = 40;
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		System.out.println(a);
		Demo2 d1 = new Demo2();
		System.out.println(d1.b);
		int c = 20;
		System.out.println(c);
		System.out.println("main ends");
	}
}
