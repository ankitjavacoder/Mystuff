import java.util.Scanner;
class Tenthnumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter m value");
		int m = sc.nextInt();
		System.out.println("Please enter n value");
		int n = sc.nextInt();
		int count = 0;
		for (int i=m;i<n ;i++ )
		{
		 count++;
		}
		if (count%2==0)
		{
			System.out.println(count);
			count= count +10;
			System.out.println("count value is : "+ count);

		}
			else {
			System.out.println(count);
			count=count-10;
			System.out.println("count value is : "+ count);
			}
	}

}
