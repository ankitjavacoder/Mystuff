class Default
{
	public void move(){
	System.out.println("moves north");
	}
}
class Demo extends Default
{
	public void move(){
	System.out.println("moves south");
	}
}
class MainClass 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts!");
		Default d1 = new Default();
		Demo d2 = new Demo();
		d1.move();
		d2.move();
		System.out.println("main ends!");
	}
}
