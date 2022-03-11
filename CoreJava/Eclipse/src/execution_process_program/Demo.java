package execution_process_program;

class Demo 
{
	public static int a = 10;
	public int b = 30;
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		System.out.println(a);
		Demo d1 = new Demo();
		System.out.println(d1.b);
		System.out.println("main ends");
	}
}
