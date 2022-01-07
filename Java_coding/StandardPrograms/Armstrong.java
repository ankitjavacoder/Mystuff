import java.util.Scanner;
class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		int sum = 0;
		int temp = n;
		int count = 0;
		int check = n;
		while (n!=0)
		{
			count++;
			n/=10;
		}
		while (temp!=0)
		{
			int rem = temp%10;
			int power = 1;
			for (int i = 1;i<=count ;i++ )
			{
				power *= rem;
			}
			sum+= power;
			temp/=10;
		}
		if (sum == check)
		{
			System.out.println("Its Armstrong number");
		}
		else System.out.println("Its not armstrong number");
	}
}
