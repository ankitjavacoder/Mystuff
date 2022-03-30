package inheritance;

class A 
{
	public static int i = 10;
}
class B extends A
{
	public static int j = 20;
}
class C extends A
{
	public static int k = 30;
	public static void main(String[] args) {
	System.out.println(" int i = "+ i);
	System.out.println(" int k = "+ k);
	}
}
