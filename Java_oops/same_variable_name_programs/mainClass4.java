class Gun
{
	public String gName;
	public String gType;
	public int gBullets;
	public Gun(String  gName,int gBullets,String gType){
		this.gName = gName;
		this.gBullets = gBullets;
		this.gType = gType;
	}
	public void GunData(){
		System.out.println("-----------******-----------");
		System.out.println("Gun type : "+ gName);
		System.out.println("Number of Bullets : "+ gBullets);
		System.out.println("Gun type : "+ gType);
	}
}
class mainClass4
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Gun g1 = new Gun("AKM",40,"Assault Riffle");
		Gun g2 = new Gun("AWM",5, "Sniper");
		g1.GunData();
		g2.GunData();
		System.out.println("main ends");	
	}
}
