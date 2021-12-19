import java.util.Scanner;
class remainder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the divident value : ");
		int divident= sc.nextInt();
		System.out.println("Enter the divisor value : ");
		int divisor = sc.nextInt();
		int temp = divident;
while(divisor<= divident)		
	{ 
			divident-=divisor;
	}
		System.out.println("The remainder of "+temp+ " divisible by "+ divisor+ " is equal to "+divident);
		
	}
}
