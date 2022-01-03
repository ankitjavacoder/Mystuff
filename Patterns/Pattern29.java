class Pattern29 
{
	public static void main(String[] args) 
	{
		int n = 5;
		for (int i = 0;i<n ;i++ )
		{
			char ch = (char)('a'+ (n-1));
				for (int j=0;j<n ; j++)
			{
				if (i<=j)
				{
					System.out.print(ch-- + " ");
				}
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
}