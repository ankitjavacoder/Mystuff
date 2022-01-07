import java.util.Scanner;
class strongnumbersummation 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n Value");
		int n = sc.nextInt();
		int temp = n;
		int rem = 0;
		int fact = 0;
		while (n!=0)
		{
			rem = n%10;
			int prod = 1;
			for (int i = 1;i<=rem ;i++ )
			{
				prod = prod*i;
				
			}
				fact = fact+prod;
				n= n/10;
		}
		if (temp == fact)
		{
			int sum = 0;
			for (int i = 1;i<temp ;i++ )
			{
				if (temp %i == 0);
				{
					sum = sum+i;
				}
				
			}
			if (sum == temp)
				{
					System.out.println("Its perfect number");
				}
				else System.out.println("Its not perfect number");
		}
		else System.out.println("Its not strong number");
	}
}
