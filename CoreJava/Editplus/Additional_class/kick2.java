class kick2 
{
	static
	{
		System.out.println("Static Block");
	}
	{
		System.out.println("2 non-Static Block");
	}
	public static void main(String[] args) 
	{
		kick2 k1 = new kick2();
		System.out.println("Hello World!");
	}
}
