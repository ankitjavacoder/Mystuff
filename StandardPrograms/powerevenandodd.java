import java.util.Scanner;
class  powerevenandodd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X Value");
		int x = sc.nextInt();
		System.out.println("Enter the N value");
		int n = sc.nextInt();
		int prod = 1;
		int prod1 = 1;
		int sum = 0;
		int sum1 = 0;
		for (int i = 1;i<=n ;i++ )
		{
			prod = prod * x;
		}
		System.out.println("The answer is "+ prod);
		if (prod %2 ==0)
		{
			for (int i = 1;i<prod ;i++ )
			{
				if (prod % i ==0)
				{
					sum1 = sum1+i;
				}
			}
			if (prod == sum1)
			{
				System.out.println("Its even and perfect number");
			}
			else System.out.println("Its not perfect number");
		}
		else if (prod % 2 == 1)
		{
			for (int i = 1;i<=prod ;i++ )
			{
				prod1 = prod1 * i;
			}
			System.out.println("As its odd, The factorial is "+ prod1);
		}
	}

}
