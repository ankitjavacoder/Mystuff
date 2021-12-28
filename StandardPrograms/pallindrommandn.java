import java.util.Scanner;
class pallindrommandn 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m value : ");
		int pos  = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		int count = 2;
		if (pos == 1)
		{
			System.out.println(n1+" is present");
		}
			else if (pos ==2)
			{
			System.out.println(n2+" is present");
			}
		else
		{
		for (int i = 3; ;i++ )
		{
			n3 = n1+n2;
			count++;
			if (pos == count)
			{
			System.out.println(n3+" is present");
			break;
			}
			n1 = n2;
			n2 = n3;
		}
		}
	}
	}