import java.util.Scanner;
class armstrongpos 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int pos = sc.nextInt();
		int poscount = 0;
		for (int i = 1; ;i++ )
		{
			int count = 0;
			int sum = 0;
			int check = i;
			int a = i;
			int temp = i;
		while (a!=0)
		{
			count++;
			a= a/10;
		}
		while (temp!=0)
		{
			int rem = temp%10;
			int power = 1;
			for (int j = 1;j<=count ;j++ )
			{
				power = power * rem;
			}
			sum= sum+power;
			temp= temp/10;
		}
		if (sum == check)
		{
			poscount++;
		}
		if (pos == poscount)
		{
			System.out.println(sum);
			break;
		}
	}
}
}
