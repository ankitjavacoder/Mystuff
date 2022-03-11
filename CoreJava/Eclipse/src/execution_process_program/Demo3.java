package execution_process_program;

class Demo3 
{
	public static void fly()
	{
		System.out.println("fly like bird");
	}
		public void swim()
	{
		System.out.println("swim accross river");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		fly();
		Demo3 d1 = new Demo3();
		d1.swim();
		System.out.println("main ends");
	}
}
