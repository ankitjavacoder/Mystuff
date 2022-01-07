class patterasgmnt7 
{
	public static void main(String[] args) 
	{
		int n = 4;
		char ch = 'A';
		for (int i = 0;i<n ;i++ )
		{	
			for (int j = 0;j<=n ;j++ )
			{
				System.out.print(ch++ +" ");
				if (ch > 'J')
				{
					ch = 'A';
				}

			}
			System.out.println();
		}
	}
}
