import java.util.Scanner;
class reversenumber1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number");
		int m = sc.nextInt();
		System.out.println("Enter the last number");
		int n = sc.nextInt();
		for (int i = m;i<=n ;i++ )
		{
			int a = i;
			int rev = 0;
			while (a!= 0)
			{
				rev = rev*10+ a%10;
				a/=10;
			}
			System.out.println(i+" --> "+ rev);
		}
	}
}
