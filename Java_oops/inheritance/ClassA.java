class Vehicle
{
  protected String color = "black";
   
  Vehicle(int color, String colors)
  {
	  System.out.println("Greener");
    this.color = "green";
  }
}
 
public class ClassA extends Vehicle
{
  int maxPassengers;
   
  ClassA(int maxPassengers, String color)
  {
    super(1,"Te");
    this.maxPassengers = maxPassengers;
  }
  public static void main(String[] args)
  {
    ClassA car = new ClassA(6, "red");
    System.out.println(car.color);
  }
}