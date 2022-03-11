package JavabeanClass;

public class MainClass2 {

	public static void main(String[] args) {
		Book b1 = new Book("SQL", "Raja", 250, 260);
		System.out.println("Book title  : " +b1.getTittle());
		System.out.println("Book Author  : " +b1.getAuthor());
		System.out.println("Pages : "+b1.getPages());
		System.out.println("Price"+b1.getPrice());
		b1.setPages(280);
		b1.setPrice(290);
		System.out.println("Updated price : "+ b1.getPrice());
		System.out.println("Updatd Pages : " + b1.getPages());
	}

}
