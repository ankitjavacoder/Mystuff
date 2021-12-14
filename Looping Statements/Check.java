import java.util.Scanner;
class Check 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter M value :");
		int m = sc.nextInt();
		System.out.println("Please enter N value :");
		int n = sc.nextInt();
		int count = 0;
		for (int i=m;i<=n ;i++ )
		{
			if (i%3==0 && i%7==0)
			{
			count++;
			}
		}
		System.out.println("Number of  value divisible between "+m+" and "+n+" is : "+count);
		if (count %2==0)
		{
					System.out.println("count is even");
		}
		else System.out.println("count is odd");


	}
}
