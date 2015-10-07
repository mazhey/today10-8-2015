
public class Book {
 private String bookID;
 private String author;
 private String title;
 private String description;
 private double price;

 public String getBookID() {
		return bookID;
	}
 public void setBookID(String bookID) {
		this.bookID =  bookID ;
	}
 public String getAuthor() {
		return bookID;
	}
 public void setAuthor(String author) {
		this.author =  author ;
	}
 public String getTitle() {
		return title;
	}
 public void setTitle(String title) {
		this.title =  title;
	} 
 public String getDescription() {
		return title;
	}
 public void setDescription(String description) {
		this.description =  description;
	}  
 public double getPrice() {
		return price;
	}
public void setPrice(double price) {
		this.price =  price;
	}  
 
 public String getDisplayText()
 {
	 return author+ "\n"+title+"\n"+description+"\n"+bookID;
 }
 
 public Book (String bookID,String author,String title,String description,Double price)
	{
		 this.bookID= bookID;
		 this.author=author;
		 this.title=title;
		 this.description=description;
		 this.price=price;
	}
}
