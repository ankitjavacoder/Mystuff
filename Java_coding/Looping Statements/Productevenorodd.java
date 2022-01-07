import java.util.Scanner;
class Productevenorodd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter first number");
		int m = sc.nextInt();
		System.out.println("Please enter second number");
		int n = sc.nextInt();
		int temp = 1,x;
		do
		{
			x= m*temp;
			temp = x;
			m++;
		}
		while (m<=n);
					System.out.println(x);
					if (x%2==0)
					{
						System.out.println(x+" is even number");
					}
						else System.out.println(x+" is odd number");
	}
}
