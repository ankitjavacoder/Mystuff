package Polymorphism;

interface Bike{
	public void Starts();
}
class HeroHonda implements Bike{
	public void Starts() {
		System.out.println("Kick start");
	}
}
class Bullets implements Bike{
	public void Starts() {
		System.out.println("Kick/Self  start");
	}
}
class Duke implements Bike{
	public void Starts() {
		System.out.println("Self start");
	}
}
public class MainClass1 {

	public static void race(Bike b) {
		b.Starts();
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		race(new Bullets());
		race(new Duke());
		race(new HeroHonda());
		System.out.println("main ends");
	}
}
