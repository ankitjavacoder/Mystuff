class Practice4 
{
	public static void main(String[] args) 
	{
		int m = 9;
		int n = 5;
		int k = m/2;
		int p = k;
		int l = 0;
		for (int i = 0;i<n ;i++ )
		{
			for (int j = 0;j< m ; j++)
			{
				if (i==l && (j<=k && j>=p-i))
				{
					System.out.print("* ");
				}
				else System.out.print("  ");
			}
			k=k+1;
			l=l+1;
			System.out.println();
		}
	}
}
