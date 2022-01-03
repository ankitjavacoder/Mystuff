class Patter35 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int space = n-1;
		int count = 1;
		for (int i = 0;i<n ;i++ )
		{
			char ch = 'a';
			for (int j = 0;j< space ; j++)
			{
				System.out.print("  ");
			}
			for (int j=0;j<count ;j++ )
			{
					System.out.print(ch++ +" ");
			}
			space--;
			count += 2;
			System.out.println();
		}
	}
}
