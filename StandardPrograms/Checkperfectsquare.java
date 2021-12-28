import java.util.Scanner;
class Checkperfectsquare 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		boolean status = false;
		for (int i=1;i<n ;i++ )
		{
			if (i*i == n)
			{
				status = true;
				break;
			}	
	}
	if (status)
		{
			System.out.println("Its perfect Square number");
		}
		else System.out.println("Its not perfect Square number");
}
}

