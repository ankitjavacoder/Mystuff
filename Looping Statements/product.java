import java.util.Scanner;
class product 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter first number");
		int m = sc.nextInt();
		System.out.println("Please enter second number");
		int n = sc.nextInt();
		int temp = 1,x;
		do
		{
			x= m*temp;
			temp = x;
			m++;
		}
		while (m<=n);
					System.out.println(x);
	}
}
