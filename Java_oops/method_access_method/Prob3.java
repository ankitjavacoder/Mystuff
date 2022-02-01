class Prob3 
{
	public void Hi()
	{
		System.out.println("Non Static method 2 starts");
		Hello();
		System.out.println("Non Static method 2 ends");
	}
	public static void Hello()
	{
		System.out.println("static method 1 starts");
		System.out.println("Task Completed");
		System.out.println("static method 1 endss");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Prob3 p1 = new Prob3();
		p1.Hi();
		System.out.println("main ends");
	}
}
