import java.util.Scanner;
class ScanBoolean 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value true/false : ");
		boolean value = sc.nextBoolean();
		System.out.println(value);
		}
}
