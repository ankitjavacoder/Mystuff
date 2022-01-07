import java.util.Scanner;
class pattern15 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		for (int i = 0;i<n ;i++ )
		{
			int m = 1;
			for (int j = 0;j<n ;j++ )
			{
				if (j==n/2)
				{
					System.out.print("* ");
				}
				else if (i == n/2)
				{
					System.out.print("* ");
				}
				else System.out.print(m++ +" ");
			}
			System.out.println();
		}
	}
}
