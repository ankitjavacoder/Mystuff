class pattern5
{
	public static void main(String[] args) 
	{
		int n = 4;
		for (int i = 0;i<=4 ;i++)
		{
			for (int j = 0;j<n ;j++ )
			{
				if (i == 1 && j ==0 || i == 4 && j == 3)
				{
					System.out.print("A ");
				}
				else if (i==1 && j == 2 || i ==3 && j == 0)
				{
					System.out.print("@ ");
				}
				else if (i== 2 && j == 3 || i== 3 && j == 1)
				{
				System.out.print("$ ");
				}
				else if (i== 2 && j == 1 || i== 4 && j == 2)
				{
				System.out.print("2 ");
				}
				else System.out.print("# ");
			}
		System.out.println();
		}
	}
}
