package exceptionhandling.Compiletimeexception;

public class Program4 {
public void validAge(int age) throws Throwable {
	if (age>=18) {
		System.out.println("you can buy");
	} else {
		throw new Exception("age is not legal");
	}
}
public static void main(String[] args) throws Throwable {
	Program4 p1 = new Program4();
	p1.validAge(15);
}
}
