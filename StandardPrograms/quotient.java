import java.util.Scanner;
class quotient 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the divident value : ");
		int divident= sc.nextInt();
		System.out.println("Enter the divisor value : ");
		int divisor = sc.nextInt();
		int temp = divident,count = 0;;
while(divisor<= divident)		
	{ 
			divident-=divisor;
			count++;
	}
		System.out.println("The quotient of "+temp+ " divisible by "+ divisor+ " is equal to "+count);
		
	}
}
