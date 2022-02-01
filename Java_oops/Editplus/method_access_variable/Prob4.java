class Prob4 
{
	public static int i = 10;
	public void Hello()
	{
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Prob4 p1 = new Prob4();
		p1.Hello();
		System.out.println("main ends");
	}
}
