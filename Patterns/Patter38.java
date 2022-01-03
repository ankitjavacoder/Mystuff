class Patter38 
{
	public static void main(String[] args) 
	{
		int count = 1;
		int n = 9;
		int sp = (n-1)/2;
		for (int i = 0;i<n ;i++ )
		{
			int k = 0;
			for (int j = 0;j<sp ;j++ )
			{
				System.out.print("  ");
			}
			for (int j = 0;j<count ;j++ )
			{
				System.out.print(k++ +" ");
				if (k>1)
				{
					k = 0;
				}
			}
				
				if (i<n/2)
				{
					sp--;
					count+=2;
				}
				else {
					sp++;
					count-=2;
				}
				System.out.println();
			}
		}
	}
