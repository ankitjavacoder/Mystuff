import java.util.Scanner;
class factpallinsumm 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int temp = n;
		int rev = 0;
		int sum = 0;
		int prod = 1;
		int rem = 0;
		while (n!=0)
		{
			rev = n%10+rev*10;
			n = n/10;
		}
		if (temp == rev)
		{
			for (int i = 1;i<=temp ; i++)
			{
				prod = prod * i ;

			}
			int fact = prod;
			System.out.println("its pallindrome & its factorial is "+prod);
			while (fact!=0)
			{
				rem = fact % 10;
				sum = sum+ rem;
				fact = fact/10;
			}
		System.out.println("The summation is "+ sum);
		}
		else System.out.println("Its not pallindrome");
	}
}
