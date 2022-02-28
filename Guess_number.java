import java.util.Scanner;
class Project2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double secret = Math.random()* 10;
		int a= (int)secret;
		System.out.println("Welcome to number guessing game");
		System.out.println("Please enter a number between 0 to 10");
		int b= sc.nextInt();

		if (a!=b)
		{
			int w=0,v=0;
			while (b!=a)
			{
			w++;
				System.out.println("Wrong Attempt " + w +" try again");
				int c = sc.nextInt();
				b=c;
				//System.out.println("Wrong Attempt try again");
				v= w;
			}
			v=w;
			System.out.println("Its correct, finally you  have given answer after "+v+ " attempts" );
		}	
		else {System.out.println("Its correct finally you have given answer after attempts");
		System.out.println("Enter the number");
		int cc = sc.nextInt();
		if (cc==1)
		{
			continue;
		}
		else if (c==2)
		{
			System.out.println("Exit");
			break;
		}}
			
		
	}
}
