package JavabeanClass;

	public class Book {
	private String tittle;
	private String author;
	private int price;
	private int pages;
	public Book(String tittle, String author, int price, int pages) {
		super();
		this.tittle = tittle;
		this.author = author;
		this.price = price;
		this.pages = pages;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getTittle() {
		return tittle;
	}
	public String getAuthor() {
		return author;
	}

}
