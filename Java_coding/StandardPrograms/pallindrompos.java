import java.util.Scanner;
class pallindrompos 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int pos  = sc.nextInt();
		int count = 0;
		for (int i = 1; ;i++ )
		{
			int a = i;
			int rev = 0;
			while (a!=0)
			{
				rev = rev*10+a%10;
				a/=10;
			}
		if (i == rev)
		{
			count++;
		}
		if (count == pos)
		{
				System.out.println(rev);
				break;
		}
	}
}
}