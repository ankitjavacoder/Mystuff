import java.util.Scanner;
class Spynumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int prod = 1;
		int sum = 0;
		System.out.println("Enter the N value");
		int n = sc.nextInt();
		int temp = n;
		while (n!=0)
		{
			int rem = n%10;
			prod *= rem;
			sum += rem;
			n/=10;
		}
		if (prod == sum)
		{
					System.out.println(temp+ " is spy number");
		}
			else	System.out.println(temp+ " is not spy number");
	}
}
