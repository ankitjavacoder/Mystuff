import java.util.Scanner;
class Summationanddivisible 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value");
		int n = sc.nextInt();
		int sum=0,rem=0;
		int count = 0;
		while (n!=0)
		{
			rem = n%10;
			sum += rem;
			n/=10;
		}
		if (sum%3==0)
		{
			int quotient =sum/3;
			for (int i =1;i<quotient ;i++ )
			{
				if (quotient%i == 0)
				{
					count+=i;
				}

			}
			if (count == quotient)
			{
				System.out.println("Its quotient is  perfect number");

			}
			else System.out.println("Its quotient is not  perfect number");

		}
	}
}
