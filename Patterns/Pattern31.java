class Pattern31 
{
	public static void main(String[] args) 
	{
		int n = 4;
		char ch = 'A';
		for (int i = 0;i<n ;i++ )
		{
			int k = 1;
			for (int j=0;j<n ; j++)
			{
				if (i>=j)
				{
					if (i%2==1)
					{
						System.out.print(k++ +" ");
					}
					else 	System.out.print(ch++ +" ");
				}
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
}