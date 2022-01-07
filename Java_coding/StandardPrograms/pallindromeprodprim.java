import java.util.Scanner;
class pallindromeprodprim
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		int temp = n;
		int n1 = n;
		int prod = 1;
		/* 1. first reverse the number 
		   2. check the condition
		   if pallindrome do product of digits
		   3. check prime number
		   */
		int rev = 0;
		while (n!=0)
		{
			rev = n%10+rev*10;
			n/=10;
		}
		if (temp == rev)
		{
			System.out.println(temp+ " is pallindrome");
			while (n1 != 0)
			{
				int rem = n1%10;
				prod = prod*rem;
				n1 /= 10;

			}
			boolean isprime = true;
			for (int i = 2;i<prod ;i++ )
			{
				if (prod % i == 0)
				{
					isprime = false;
					break;
				}
				
			}
			if (isprime)
				{
					System.out.println(prod+ " is prime number");
				}
					else System.out.println(prod+" is not prime number");
		}
		else System.out.println("Its not pallindrome");

	}
}
