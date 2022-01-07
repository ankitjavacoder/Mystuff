import java.util.Scanner;
class counteven 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter m value");
		int m = sc.nextInt();
		System.out.println("Please enter n value");
		int n = sc.nextInt();
		int count = 0;
		for (int i=m;i<=n ;i++ )
		{
			if (i%2==0)
			{
				 count++;
			}
		}
		System.out.println("count of even number is " + count);
	}

}
