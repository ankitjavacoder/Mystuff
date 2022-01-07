class Pattern28 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int space = n-1;
		int count = 1;
		int k = 0;
		for (int i = 0;i<n ;i++ )
		{
			for (int j = 0;j<space ;j++ )
			{
				System.out.print("  ");
			}
			for (int j = 0;j<count ;j++ )
			{
				System.out.print(k++ + " ");
				if (k>=2)
				{
					k=0;
				}
			}
			space--;
			count += 2;
			System.out.println();
		}
	}
}
