package Abstract;

 abstract class Demo2 {
	 abstract public void walk();
	
}
 abstract class Demo3{
	 
 }
 class Demo4 extends Demo3{
	 public void walk () {
		 System.out.println("Walk here");
	 }
 }
public class MainClass3 {

	public static void main(String[] args) {
		System.out.println("main Starts here!");
		Demo4 d1 = new Demo4();
		d1.walk();
		System.out.println("main ends here!");
	}

}
