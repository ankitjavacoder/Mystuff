import java.util.Scanner;
class Checkperfectsqaure 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter N value");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		int prod = 1;
		boolean status = false;
		for (int i = 1;i<n ;i++ )
		{
			if (i*i == n)
			{	
				status = true;
				break;
			}
		}
		if (status)
		{	while (n!=0)
		{
			int rem = n%10;
			sum = sum+rem;
			prod = prod*rem;
			n = n/10;
		}
			if (sum == prod)
			{
					System.out.println(temp+" is  Perfect square number and spy number");
			}
			else System.out.println(temp+" is perfect square number but not spy number");
		}
		else System.out.println(temp+ " is not Perfect square number");
	}
}
