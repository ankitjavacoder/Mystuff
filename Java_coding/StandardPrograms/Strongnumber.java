import java.util.Scanner;
class Strongnumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		int temp = n;
		int rem = 0;
		int fact = 0;
		/* 1--> removing last digit
		   2--> doing factorial
		   3--> summation of variable
		   4--> check the n value and final value
		   */
		while (n!=0)
		{
			rem = n%10;
			int prod = 1;
			for (int i = 1;i<=rem ;i++ )
			{
				prod = prod*i;
				
			}
				fact = fact+prod;
				n= n/10;
		}
		if (temp==fact)
		{
			System.out.println(temp+ " is Strong number");
		}
		else System.out.println(temp+ " is weak number");
	}
}
