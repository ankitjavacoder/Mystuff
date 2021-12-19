import java.util.Scanner;
class Aadhar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please ennter Aadhar number value");
		long n = sc.nextLong();
		int count = 0;
		while (n!=0)
		{
			n/=10;
			count++;
		}
		if (count == 12)
		{
					System.out.println("The Aadhar number is valid");
		}
		else 	System.out.println("The Aadhar number is not valid");

	}
}