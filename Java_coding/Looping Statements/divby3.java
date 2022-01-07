import java.util.Scanner;
class  divby3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int m = sc.nextInt();
		System.out.println("Enter the Second number");
		int n = sc.nextInt();
		do
		{
			if (m%3 == 0)
			{
			System.out.println(m);
			}
			m++;
		}
		while (m<=n);
	}
}
