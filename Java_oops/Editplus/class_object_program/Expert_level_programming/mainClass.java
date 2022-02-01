class Demo
{
	public Demo(){
	System.out.println("Demo class without argument");
	}
}
class mainClass 
{
	public static void main(String[] args) 
	{
	System.out.println("main starts!");
	Demo d1 = new Demo();
	Demo d2 = new Demo();
	Demo d3 = new Demo();	
	System.out.println("main ends!");
	}
}
