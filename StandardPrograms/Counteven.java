import java.util.Scanner;
class Counteven 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please ennter N value");
		int n = sc.nextInt();
		int count = 0;
		while (n!=0)
		{
			int rem = n%10;
			if (rem%2==0)
			{
				count++;
			}
			n/=10;

		}
		System.out.println("The number of even digits is "+count);
	}
}
