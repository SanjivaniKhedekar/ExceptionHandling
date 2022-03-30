package pkg8;

public class NestedTry 
{
public static void main(String[] args) 
{
		
 try
 {
	 try
	 {
		 try
		 {
			 int arr[]= {1,2,3,4};
			 System.out.println(arr[10]);
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("Arithmetic exception");
			 System.out.println("Inner try block 2");
		 }
	 }
	 		 catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println(e);
			 System.out.println("Outer try block 2");
		 }
     }
		 catch(Exception e)
		 {
			 System.out.println("Exception");
			 System.out.println("Handled in main try block");
		 }
}
}
