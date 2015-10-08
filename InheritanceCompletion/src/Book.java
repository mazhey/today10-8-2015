
public final  class Book extends Product {

	    private String author;
	    private int pages;
	   
	    public String WhoAmI()
	    {
	        
	      return "I am a book";
	    }
       
	    @Override
	    public boolean equals(Object o)
	    {
	    	Book B=(Book) o;
	    	if (super.equals(o)&&B.author.equals(author)&& B.pages==pages){
	    		return true;
	    	}
	    	else
	    	{
	    		return false;
	    	}
	    
	

	    }
}
