import java.util.Scanner;
class primemandn 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int pos  = sc.nextInt();
		int count = 0;
		for (int i = 0; ;i++ )
		{
			int a = i;
			boolean isprime = true;
			for (int j = 2;j<a ;j++ )
			{
				if (a%j==0)
				{
					isprime = false;
					break;
				}
			}
			if (isprime)
			{
				count++;
			}
			if (pos == count)
			{
				System.out.println(a);
				break;
			}
		}

	}
}
