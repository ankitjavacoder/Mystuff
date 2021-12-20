import java.util.Scanner;
class reversenumbersummationandproduct
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N value : ");
				int n  = sc.nextInt();
		int temp = n;
		int rev = 0;
		int sum =0;
		int prod = 1;
		int lastdigit = 0;
		while (n!=0)
		{
			lastdigit =n%10;
			sum += lastdigit;
			prod *= lastdigit;
			rev = lastdigit + rev*10;  
			n/=10;
		}
		System.out.println("The reverse of "+ temp + " is " +rev);
		System.out.println("The Summation of "+ temp + " is "+ sum);
		System.out.println("The Production of "+ temp + " is "+ prod);
		if (sum == prod)
		{
			System.out.println("Summation and product are equal");
		}
		else  System.out.println("Summation and product are not equal");

	}
}