class DistanceTravel{
	public static int speed = 140;
	public int time;
	public String brandName;
	public void CalculateDistance(){
	System.out.println("---------***--------");
	System.out.println("Speed of "+ brandName + " is "+speed + "km/hour for duration of " + time+ " hours");
	System.out.println("Distance travelled by "+brandName + " is "+ speed * time + " kms");
}
}
public class Asgmnt {
	public static void main(String[] args) {
		DistanceTravel c1 = new DistanceTravel();
		DistanceTravel c2 = new DistanceTravel();
		DistanceTravel c3 = new DistanceTravel();
		DistanceTravel c4 = new DistanceTravel();
		c1.time = 5;
		c1.brandName = "BMW";
		c2.time = 1;
		c2.brandName = "Audi";
		c3.time = 2;
		c3.brandName = "Mercedez";
		c4.time = 3;
		c4.brandName = "Ferari";
		c1.CalculateDistance();
		c2.CalculateDistance();
		c3.CalculateDistance();
		c4.CalculateDistance();
	}
}
