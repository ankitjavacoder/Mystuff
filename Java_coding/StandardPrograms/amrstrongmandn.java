import java.util.Scanner;
class  amrstrongmandn
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the m value");
		int m = sc.nextInt();
		System.out.println("Enter the n value");
		int n = sc.nextInt();
		for (int i = m;i<=n ;i++ )
		{
			int a = i;
			int sum = 0;
			int count =0;
			int temp = i;
			int check = i;
			while (a!=0)
			{
				count++;
				a = a/10;
			}
			while (temp!=0)
			{
				int rem = temp%10;
				int power = 1;
				for (int j = 1;j<=count ;j++ )
				{
					power *= rem;
				}
				sum += power;
				temp = temp/10;
			}
				if (sum == i)
				{
					System.out.println(sum);
				}
		}
	}
}
