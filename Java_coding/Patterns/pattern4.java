class pattern4
{
	public static void main(String[] args) 
	{
		int n = 4;
		for (int i = 0;i<4 ;i++)
		{
			for (int j = 0;j<=n ;j++ )
			{
				if (i == 1 && j ==1 || i == 2 && j == 4 || i == 3 && j == 3)
				{
					System.out.print("$ ");
				}
				else if (i==1 && j == 3 || i ==3 && j == 4)
				{
					System.out.print("* ");
				}
				else if (i== 3 && j == 0)
				{
				System.out.print("# ");
				}
				else System.out.print("! ");
			}
		System.out.println();
		}
	}
}
