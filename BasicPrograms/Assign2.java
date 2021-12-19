class Assign2 
{
	public static void main(String[] args) 
	{
		int a = 47;
		int b = 12;
		a = a%b;
		a = a+b;
		b=b-10;
		a=(a/b)+(b%a);
		b=b-a;
		a=a*b;
		a=a+b;
		System.out.println(a);
		System.out.println(b);
	}
}
