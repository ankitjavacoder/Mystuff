import java.util.Scanner;
class Countdigitsunits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please ennter N value");
		int n = sc.nextInt();
		while (n!=0)
		{
			int rem = n%10;
			System.out.println(rem);
			n/=10;
		}
	}
}
