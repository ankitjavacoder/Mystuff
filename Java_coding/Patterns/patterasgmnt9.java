class patterasgmnt9  
{
	public static void main(String[] args) 
	{
		int n = 4;
		int k = 1;
		for (int i = 0;i<n ;i++ )
		{	
			for (int j = 0;j<n ;j++ )
			{
				
				if (k>7)
				{
					k = 1;
				}
					System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}
	}
