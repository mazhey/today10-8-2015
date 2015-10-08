
public final class Software extends Product {
	 private String programmer;
	    private String platform; //linux, mac, or pc
	    private String os; 
	    
	    public String WhoAmI()
	    {
	        
	       return "I am a software";
	    }
	    
	    @Override
	    public boolean equals(Object o)
	    {
	    	Software S=(Software) o;
	    	if (super.equals(o)&&S.programmer.equals(programmer)&&S.os.equals(os)&&S.platform.equals(platform) ){
	    		return true;
	    	}
	    	else
	    	{
	    		return false;
	    	}
	    }

}
