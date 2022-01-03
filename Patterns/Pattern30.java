class Pattern30 
{
	public static void main(String[] args) 
	{
		int n = 4;
		int k = 1;
		char ch = 'a';
		for (int i = 0;i<n ;i++ )
		{
			for (int j=0;j<n ; j++)
			{
				if (i>=j)
				{
					if (j%2==0)
					{
						System.out.print(k +" ");
						k+=2;
					}
					else 	System.out.print(ch++ +" ");
					if (k>=10)
					{
						k=1;
					}

				}
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
}