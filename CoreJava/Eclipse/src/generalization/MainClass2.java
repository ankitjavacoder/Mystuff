package generalization;
class Animal {
	public void hunt() {
		System.out.println("hunt for food");
	}
	public void roam() {
		System.out.println("roam arround forest");
	}
	public void fight() {
		System.out.println("fight to win");
	}
}
class lion extends Animal{
	
}
class tiger extends Animal{
	
}
class cheetah extends Animal{
	
}
 class MainClass2 {
	 public static void display(Animal s) {
		 s.fight();
		 s.hunt();
		 s.roam();		 
	 
	 }
	public static void main(String[] args) {
		System.out.println("main starts");
		display(new lion());
		display(new tiger());
		display(new cheetah());
		System.out.println("mainends");
	}
 }