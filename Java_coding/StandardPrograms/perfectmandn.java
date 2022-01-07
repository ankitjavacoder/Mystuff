import java.util.Scanner;
class perfectmandn 
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
			int count = 0;
			for (int j = 1;j<a ;j++ )
			
				if (a%j == 0)
				{
					count = count+j;
				}
			a/=10;
		if (i == count)
		{
			System.out.println(i);
		}
	}
	}
}
