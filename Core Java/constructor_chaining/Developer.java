package constructor_chaining;

public class Developer extends Employee {
	public String language;
	public Developer(int id,String Name,double salary,String language) {
		super(id, Name,salary);
		this.language = language;
	}
	public void print() {
		System.out.println("Developer Details");
		Display();
		System.out.println("Language : "+ language);
	}
}
