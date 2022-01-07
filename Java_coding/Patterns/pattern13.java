import java.util.Scanner;
class pattern13 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		for (int i = 0;i<n ;i++ )
		{
			char ch = 'a';
			for (int j = 0;j<n ;j++ )
			{
					System.out.print(ch++ +" ");
			}
			System.out.println();
		}
	}
}
