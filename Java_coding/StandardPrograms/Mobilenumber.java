import java.util.Scanner;
class Mobilenumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please ennter N value");
		long n = sc.nextLong();
		int count = 0;
		while (n!=0)
		{
			n/=10;
			count++;
		}
		if (count == 10)
		{
					System.out.println("The mobile number is valid");
		}
		else 	System.out.println("The mobile number is not valid");

	}
}
