package pkg8;

public class TryCatch 
{
	public static void main(String[] args) 
	{  
		try  
        {  
          int a=20/0; 
        }  
        
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        System.out.println("Can't divide by zero" );  
    }  
}
	
/*int i=50;
int j=0;
int k;
try  
{  
  k=i/j;
}  

catch(Exception e)  
{  
    System.out.println(i/(j=2));  
}  */
  