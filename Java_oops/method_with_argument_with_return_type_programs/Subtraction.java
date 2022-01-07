class Subtraction 
{
	public double subtract(int a,double b)
	{
		return a-b;
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts!");
		Subtraction s1= new Subtraction();
		double res = s1.subtract(10,4.2);
		System.out.println(res);
		System.out.println("main ends!");
	}
}
