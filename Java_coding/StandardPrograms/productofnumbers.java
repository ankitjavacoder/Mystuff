import java.util.Scanner;
class productofnumbers 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please ennter N value");
		int n = sc.nextInt();
		int count=1;
		while (n!=0)
		{
			int rem = n%10;
			count =count*rem;
			n/=10;
		}
					System.out.println(count);

	}
}
