class Demo 
{
	public static void Hello()
	{
		System.out.println("Hello ");
	}
	public static void Hi()
	{
		System.out.println("Hi ");
	}
		public static void How()
	{
		System.out.println("How are you ");
	}
	public static void bye()
	{
		System.out.println("bye ");
	}
	public static void main(String[] args) 
	{
	System.out.println("main begins");
	Hello();
	Hi();
	Demo d1 = new Demo();
	d1.How();
	d1.bye();
	System.out.println("main ends");
	}
}
