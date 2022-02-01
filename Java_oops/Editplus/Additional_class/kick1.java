class kick1 
{
	static
	{
		System.out.println("Static Block");
		{
		System.out.println("1 non static Block");
		{
		System.out.println("2 non-Static Block");
		}
	}
	}
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
