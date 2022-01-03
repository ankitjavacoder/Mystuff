class patterasgmnt6  
{
	public static void main(String[] args) 
	{
		int n = 4;
		int k = 1;
		char ch = 'a';
		for (int i = 0;i<n ;i++ )
		{	
			for (int j = 0;j<n ;j++ )
			{
				
				if (j%2==0)
				{
					System.out.print(k++ +" ");
				}
				else if (j%2==1)
					{
					System.out.print(ch++ +" ");
					k=k+1;
				}
				if (k>=10)
				{
					k=0;
				}

			}
			System.out.println();
		}
	}
}
