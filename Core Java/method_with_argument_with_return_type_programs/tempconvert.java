package method_with_argument_with_return_type_programs;

import java.util.Scanner;
class tempconvert 
{
	public static double temp(double celsius)
	{
		double farenheit =  1.8*celsius + 32;
		return farenheit;
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in celsius(C) ");
		double celsius = sc.nextInt();
		double result = temp(celsius);
		System.out.println("The temperature in farenheit is : "+result+" F");
		System.out.println("main ends!");
	}
}
