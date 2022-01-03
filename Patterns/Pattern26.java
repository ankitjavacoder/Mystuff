class Pattern26 
{
	public static void main(String[] args) 
	{
		int n = 4;
		int sp = n-1;
		int count = 1;
		for (int i = 0;i<n ;i++ )
		{
		char ch = 'a';
		for (int j=0;j<sp ;j++ )
		{
		System.out.print("  ");
		}
		for (int j = 0;j<count ;j++ )
		{
		System.out.print(ch++ +" ");
		}
		sp--;
		count +=2;
		System.out.println();
		}
	}
}
