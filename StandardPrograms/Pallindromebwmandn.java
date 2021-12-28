import java.util.Scanner;
class Pallindromebwmandn 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter M value");
		int m = sc.nextInt();
		System.out.println("Enter M value");
		int n = sc.nextInt();
		for (int i = m;i<=n ;i++ )
		{
			int a = i;
			int rev = 0;
			while (a!=0)
			{
				rev = rev*10+a%10;
			a/=10;
			}
		int sum = 0;
		if (i == rev)
		{
			while (rev != 0)
			{
				int rem = rev%10;
				sum = sum + rev;
				rev = rev/10;
			}
			if (sum % 5 == 0)
			{
				for (int j = 2;j< sum;j++ )
				{
					if (sum % j == 0)
					{
						System.out.println("Its not prime number");
						break;
					}
				}
			}
			else {	
					for (int k = 1;k<sum ;k++ )
					{
						int count = 0;
						if (sum % k == 0)
						{
							count = count+i;
						}
						//System.out.println(count+ " is perfect number");
						else System.out.println(sum+ " is not perfect number");

					}
				}
		}
		}

	}
}
