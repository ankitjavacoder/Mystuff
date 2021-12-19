import java.util.Scanner;
class ScanChar 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		char ch = sc.next().charAt(0);
		System.out.println("The first character is : "+ ch);
	}
}
