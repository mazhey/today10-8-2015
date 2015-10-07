
public class BookApp {
	public static void main(String[] args){
		
		Book myBook = new Book(null, null, null, null, null);
		myBook.setAuthor("Bill Waterson");
		myBook.setBookID("CH101");
		myBook.setTitle("Calvin & Hobbes Collection volume I");
		myBook.setDescription("I don't know");
		System.out.println(myBook.getDisplayText());
		
	}

}

/*
public class BookApp {
	public static void main(String[] args){
		String author="Bill Waterson";
		String bookID="CH101";
		String title="Calvin & Hobbes Collection volume I";
		String description = "I don't know";
		Book myBook = new Book(bookID,author,title,description);
		
		System.out.println(myBook.getDisplayText());
		
	}

}
*/