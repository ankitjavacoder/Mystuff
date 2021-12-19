class oddasciisummation 
{
	public static void main(String[] args) 
	{
		int count = 0;
		for (char ch = 'a';ch <='z' ;ch++ )
		{
			int a =ch;
			if (a%2==1)
			{
				System.out.println(ch);
				count = count+a;
			}
		}
					System.out.println("The summation of  odd ascii values is "+count);

	}
}
