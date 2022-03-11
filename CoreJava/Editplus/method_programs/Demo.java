class Demo 
{
	public void move()
	{
		System.out.println("move north...");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts...");
		Demo d1 = new Demo();
		d1.move();
		System.out.println("main ends...");
	}
}
