import java.util.Scanner;
class FibonacciArmstrong
{
	public static void main (String [] args )
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the value :");
		int n = sc.nextInt();
		int n1 =0;
		int n2 = 1;
		int n3 =0;
		int sum = 0;
		for (int i=3; i<=n;i++ )
		{
			n3 = n1+n2;
			     sum+=n3;
                  n1 =n2;
				  n2 =n3;
		}
				int count = 0;
				int power=1;
				int temp =n ;
				int sum1=0;
				while (sum!=0)
		{
	count++;
	sum/=10;
}
while (temp!=0)
{
int rem = temp%10;
	
for (int i=1;i<=count ; i++)
{
 power*=rem;
}
sum1+=power;
temp/=10;
if (sum1==sum)
{
	System.out.println("Fibonacci series summation is armstrong number");
}
else
	System.out.println("Fibonacci series summmation is not a armstrong number ");

	}
	}
}