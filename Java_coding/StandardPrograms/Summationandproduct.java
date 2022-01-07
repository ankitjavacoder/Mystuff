import java.util.Scanner;
class Summationandproduct 
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
		System.out.println("The product of digits is :  " + prod);
		System.out.println("The sum of digits is :  " + sum);
	}
}
