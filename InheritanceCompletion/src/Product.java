import java.text.NumberFormat;


public abstract class Product {
	 private String code;
	    private String description;
	    private double price;
	    protected static int count = 0;   // a protected 
	                                      // static variable

	    public Product()
	    {
	        code = "";
	        description = "";
	        price = 0;
	    }
	    // get and set accessors for the code, description, 
	    // and price instance variables
	    @Override
	    public String toString()
	    {
	        return "Code:        " + code + "\n" +
	               "Description: " + description + "\n" +
	               "Price:       " +
	               this.getFormattedPrice() + "\n";
	    }
	    @Override
	    public boolean equals(Object o)
	    {
	    	Product P=(Product) o;
	    	if (P.code.equals(code)&& P.description.equals(description)&& P.price==price){
	    		return true;
	    	}
	    	else
	    	{
	    		return false;
	    	}
	    }
	    private String getFormattedPrice() {
	    	NumberFormat currency = 
	        NumberFormat.getCurrencyInstance();
	         return currency.format(price);
			
			
		}
	    public String WhoAmI()
	    {
	        
	       return "I am a product";
	    }

		// create public access for the count variable
	    public static int getCount()   
	    {                              
	        return count;
	    }

}
