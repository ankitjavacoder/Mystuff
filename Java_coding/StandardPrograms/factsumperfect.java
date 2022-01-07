import java.util.Scanner;
class  factsumperfect
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		int prod = 1;
		for (int i=1;i<=n ;i++ )
		{
			prod = prod * i;
		}
		int sum = 0;
		while (prod !=0)
		{
			int rem = prod%10;
			sum = sum+rem;
			prod = prod/10;
		}
		int sum1 = 0;
		for (int i = 1;i<sum ;i++ )
		{
			if (sum % i==0)
			{
				sum1= sum1 + i;
			}
		}
		if (sum == sum1)
		{
			System.out.println("Its perfect number");
		}
			else System.out.println("Its perfect number");
	}

}
