
class Summoffibisarm 
{
	public static void main(String[] args) 
	{
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		int sum = 0;
		for (int i = 3;i<=5 ;i++ )
		{
			n3 = n1+n2;
			sum = sum+n3;
			n1 = n2;
			n2 = n3;
		}
		int check = 0;
		int count = 0;
		int n = sum;
		int temp = sum;
		while (n!=0)
		{
			count++;
			n/=10;
		}
		while (temp!=0)
		{
			int rem = temp%10;
			int power = 1 ;
			for (int i = 1;i<=count ;i++ )
			{
				power *= rem;
			}
			check += power;
			temp/=10;
		}
			if (check == sum)
			{
				System.out.println("Its Armstrong number");
			}
			else System.out.println("Its not Armstrong number");
	}
}
