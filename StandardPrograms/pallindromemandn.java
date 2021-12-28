import java.util.Scanner;
class pallindromemandn 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int m  = sc.nextInt();
		System.out.println("Enter n value : ");
		int n  = sc.nextInt();
		for (int i = m;i<=n ;i++ )
		{
			int a = i;
			int rev = 0;
			while (a!=0)
			{
				rev = rev*10+a%10;
				a/=10;
			}
		if (i == rev)
		{
			System.out.println(i);
		}
	}
	}
}
