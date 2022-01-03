class Pattern27 
{
	public static void main(String[] args) 
	{
		int n = 4;
		int sp = n-1;
		int count = 1;
		for (int i = 0;i<n ;i++ )
		{
			int k = 0;
		for (int j=0;j<sp ;j++ )
		{
		System.out.print("  ");
		}
		
		for (int j = 0;j<count ;j++ )
		{
			if (j%2==1)
		{
			 k =0;
		}
		else if (j%2 == 0)
		{
			 k = 1;
		}
		System.out.print(k++ +" ");
		}
		if (k>=2)
		{
			k=0;
		}
		sp--;
		count +=2;
		System.out.println();
		}
	}
}
