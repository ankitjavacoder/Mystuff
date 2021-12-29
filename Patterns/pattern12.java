import java.util.Scanner;
class pattern12 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		char ch = 'A';
		for (int i = 0;i<n ;i++ )
		{
			for (int j = 0;j<n ;j++ )
			{
					System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
}
