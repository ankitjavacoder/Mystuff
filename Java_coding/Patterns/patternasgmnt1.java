class  patternasgmnt1
{
	public static void main(String[] args) 
	{
		int n = 4;
		for (int i = 0; i<n;i++ )
		{
			for (int j = 0;j<n ;j++ )
			{
				char ch = 'A';
				int temp = ch+j;
				char c = (char)temp;
				if (i == j)
				{
					System.out.print(c+" ");
				}
				else System.out.print("* ");
			}
			System.out.println();
		}
	}
}
