import java.util.Scanner;
class reversenumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value : ");
				int n  = sc.nextInt();
		int temp = n;
		int rev = 0;
		while (n!=0)
		{
			rev = rev*10+n%10;
			n/=10;
		}
		System.out.println("The reverse of "+ temp +" is " + rev);
	}
}
