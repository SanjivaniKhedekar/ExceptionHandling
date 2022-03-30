package pkg8;

class MyException extends Exception
{
	public MyException(String s)
	{
		super(s);
	}
}
public class CustomException 
{
    public static void main(String[] args) 
      {
	     try
	     {
	    	 throw new MyException("Custom Exception");
	     }
	     catch(MyException e)
	     {
	    	 System.out.println(e);
	    	 System.out.println("Hello");
	     }
      }
}
