class Flower
{
	public Flower(String  a ){
		this.a = a;
	}
	public void FlowerInfo(){
	System.out.println("Flower : " + a)
	}
}
class mainClass3 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Flower f1 = new Flower("Rose");
		Flower f2 = new Flower("Jasmine");
		Flower f3 = new Flower("marigold");
		System.out.println("main ends");	
	}
}
