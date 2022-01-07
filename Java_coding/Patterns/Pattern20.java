class Pattern20 
{
	public static void main(String[] args) 
	{
		int n = 4;
		int k = 1;
		char ch = 'A';
		for (int i = 0;i<n ;i++ )
		{
			for (int j = 0;j<n ; j++)
			{
				if (j>0 &&j<n-1)
				{
					System.out.print(k++ + " ");
				}
				else System.out.print(ch++ + " ");
			}
			System.out.println();
		}
	}
}
