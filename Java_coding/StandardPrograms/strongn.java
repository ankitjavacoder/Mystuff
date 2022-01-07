import java.util.Scanner;
class strongn 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int n  = sc.nextInt();
		int count = 0;
		int rem = 0;
		for (int i = 1; ;i++ )
		{
			int a = i;
			int fact = 0;
			int temp = i;
			while (temp!=0)
		{
			rem = temp%10;
			int prod = 1;
			for (int j = 1;j<=rem ;j++ )
			{
				prod = prod*j;
				
			}
				fact = fact+prod;
				temp= temp/10;
		}
		//System.out.println(fact);
		if (fact == i)
		{
			count++;
			//System.out.println(count);
		}
		if (count == n)
		{
				System.out.println(fact);
				break;
		}
		}
	}
}