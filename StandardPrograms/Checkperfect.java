import java.util.Scanner;
class Checkperfect 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		int sum = 0;
		for (int i=1;i<n ;i++ )
		{
			if (n%i==0)
			{
					 sum+=i;
			}
		}
		if (n==sum)
		{
			System.out.println("Its perfect number");
		}
		else System.out.println("Its not perfect number");
	}
}
