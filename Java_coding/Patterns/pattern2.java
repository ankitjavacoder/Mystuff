class pattern2
{
	public static void main(String[] args) 
	{
		int n = 4;
		for (int i = 0;i<4 ;i++)
		{
			for (int j = 0;j<n ;j++ )
			{
				if (i == 2 && j ==2)
				{
					System.out.print("@ ");
				}
				else System.out.print("* ");
			}
		System.out.println();
		}
	}
}
