class Prob3 
{
	public int i = 10;
	public static void Hello()
	{
		Prob3 p1 = new Prob3();
		System.out.println(p1.i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Hello();
		System.out.println("main ends");
	}
}
