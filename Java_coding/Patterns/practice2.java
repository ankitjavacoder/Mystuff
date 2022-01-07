/*
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6 7
1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/
class practice2 
{
	public static void main(String[] args) 
	{
		int n = 13;
		for (int i = 1;i<n ;i++ )
		{
			for (int j = 1;j<i ;j++ )
			{
				System.out.print(j+" ");
				if (j == 7)
				{
					for (int k = (n/2)+1;k <=7 ;k-- )
					{
						System.out.print(k);
					}
				}
			}
			System.out.println(" ");
		}
	}
}
