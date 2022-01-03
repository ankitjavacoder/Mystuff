class patterasgmnt10 
{
	public static void main(String[] args) 
	{
		int n = 4;
		int sp = n-1;
		int stars = 1;
		for (int i = 0;i<n ;i++ )
		{
		for (int j=0;j<sp ;j++ )
		{
		System.out.print("  ");
		}
		for (int j = 0;j<stars ;j++ )
		{
		System.out.print("* ");
		}
		
		sp--;
		stars +=2;
		System.out.println();
		}
	}
}
