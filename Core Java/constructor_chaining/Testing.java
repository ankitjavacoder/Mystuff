package constructor_chaining;

public class Testing extends Employee {
	public String language;
	public Testing(int id,String Name,double salary,String language) {
		super(id, Name,salary);
		this.language = language;
	}
	public void print() {
		System.out.println("Tester Details");
		Display();
		System.out.println("Language : "+ language);
	}
}
