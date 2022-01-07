import java.util.Scanner;
class reversenumberdivby5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value : ");
				int n  = sc.nextInt();
		int temp = n;
		int rev = 0;
		int sum =0;
		int lastdigit = 0;
		while (n!=0)
		{
			lastdigit =n%10;
			sum += lastdigit;
			rev = lastdigit + rev*10;  
			n/=10;
		}
		System.out.println("The reverse of "+ temp + " is " +rev);
		System.out.println("The Summation of "+ temp + " is "+ sum);
		if (sum%5==0)
		{
			System.out.println("The reverse summation is divisible by 5 ");
		}
		else System.out.println("The reverse summation is divisible by 5 ");
	}
}
