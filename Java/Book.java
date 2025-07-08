class Book{
	private String title;
	private String author;
	private double price;
	
	//constructor
	public Book(String t,String a,double p){
        this.title=t;
        this.author=a;
        this.price=p;
	}

	public void displayBook(){
		System.out.println("Title : - "+ title);
		System.out.println("Author : - "+ author);
		System.out.println("Price : - "+ price);

	}
}
public class BookDemo{
	public static void main(String args[]){
		Book book1=new Book("Life","Tanu",1000);
		Book book2 = new Book("Love", "Penguin", 2000);
        	Book book3 = new Book("Career", "Deeksha", 1922);

        	book1.displayBook();
        	book2.displayBook();
        	book3.displayBook();
	}
}
