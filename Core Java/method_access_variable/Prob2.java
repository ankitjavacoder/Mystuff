package method_access_variable;

class Prob2 
{
	public int i = 10;
	public void Hello()
	{
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Prob2 p1 = new Prob2();
		p1.Hello();
		System.out.println("main ends");
	}
}
