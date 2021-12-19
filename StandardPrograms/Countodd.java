import java.util.Scanner;
class Countodd
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter N value");
		int n = sc.nextInt();
		int count = 0;
		while (n!=0)
		{
			int rem = n%10;
			if (rem%2==1)
			{
				count++;
			}
			n/=10;

		}
		System.out.println("The number of odd digits is "+count);
	}
}
