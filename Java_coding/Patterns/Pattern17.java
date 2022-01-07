class Pattern17 
{
	public static void main(String[] args) 
	{
		int n = 4;
		int k = 1;
		for (int i = 0;i<n ;i++ )
		{
			char ch = 'a';
			for (int j = 0;j<n ; j++)
			{
				if (i%2 == 0)
				{
					System.out.print(k++ + " ");
				}
				else System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}
}
