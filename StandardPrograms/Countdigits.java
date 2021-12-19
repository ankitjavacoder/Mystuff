import java.util.Scanner;
class Countdigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please ennter N value");
		int n = sc.nextInt();
		int count = 0;
		while (n!=0)
		{
			n/=10;
			count++;
		}
		System.out.println("The count of digits in number is "+ count);

	}
}
