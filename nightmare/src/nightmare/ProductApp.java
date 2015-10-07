package nightmare;

public class ProductApp {

	public static void main(String[] args) {
		Book aBook = new Book();
		aBook.setCode("abcd");
		System.out.println(aBook);
		Software asoftware =new Software();
		
		System.out.println(asoftware);
		
		Book bBook = new Book();
		System.out.println(bBook);
		Software bsoftware =new Software();
		System.out.println(bsoftware);
		
		
		

	}

}
