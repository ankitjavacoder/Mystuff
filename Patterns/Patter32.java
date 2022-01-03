class Patter32 
{
	public static void main(String[] args) 
	{
		int n = 4;
		int k = 0;
		for (int i = 1;i<=n ;i++ )
		{
			k = k+i;
			int g = k;
			for (int j = 1;j<=n ;j++ )
			{
				if (i>=j)
				{
					System.out.print(g-- + " ");
				}
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
}
