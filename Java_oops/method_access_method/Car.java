class Car 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts!");
		move();
		System.out.println("main ends!");
	}
	public static void move()
	{
		System.out.println("move starts!");
		stop();
		System.out.println("move ends!");
	}
	public static void stop()
	{
		System.out.println("start starts!");
		System.out.println("stop ends!");
	}
}
