package pkg8;

public class MultipleCatch 
{
 public static void main(String[] args) 
 {
	try
	{
		int a[]=new int[5];
		a[5]=30/2;
		System.out.println(a[6]);
	}
	catch(ArithmeticException e)  
    {  
        System.out.println("Arithmatic Exception");  
    } 
	catch(ArrayIndexOutOfBoundsException e)  
    {  
     System.out.println("ArrayIndexOutOfBounds Exception");  
    }    
    catch(Exception e)  
    {  
     System.out.println("Parent Exception");  
    }   
	finally 
	{  
   	 System.out.println("finally block is always executes");  
   	 } 
	
     System.out.println("array of a[6] is not present in array");  
}
}
