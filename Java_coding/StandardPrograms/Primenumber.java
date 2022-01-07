import java.util.Scanner;
class Primenumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		boolean isprime = true;
		for (int i = 2;i<n ; i++)
		{
			if (n%i==0)
			{
				isprime = false;
				break;
			}
		}
		if (isprime)
		{
			System.out.println(n+ " is a prime number");
		}
		else System.out.println(n+ " is a  not prime number");
	}
}
