package method_access_variable;

class Prob1 
{
	public static int i = 10;
	public static void Hello()
	{
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Hello();
		System.out.println("main ends");
	}
}
