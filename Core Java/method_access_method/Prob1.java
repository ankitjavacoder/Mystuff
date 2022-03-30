package method_access_method;

class Prob1 
{
	public void Hi()
	{
		System.out.println("Non Static method 2 starts");
		System.out.println("Task Completed");
		System.out.println("Non Static method 2 ends");
	}
	public void Hello()
	{
		System.out.println("Non static method 1 starts");
		Hi();
		System.out.println("Non static method 1 endss");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Prob1 p1 = new Prob1();
		p1.Hello();
		System.out.println("main ends");
	}
}
