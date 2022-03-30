package method_with_argument_with_return_type_programs;

import java.util.Scanner;
class DistanceTravelled 
{
	public static int distance(int speed,int time)
	{
		int distance =  speed * time;
		return distance;
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the speed in km/hr : ");
		int speed = sc.nextInt();
		System.out.println("Enter the time in sec: ");
		int time = sc.nextInt();
		int result = distance(speed,time);
		System.out.println("The distance travelled is : "+result+" m");
		System.out.println("main ends!");
	}
}
