package lab10;

public class Program2 {

	public static void main(String[] args) {
		
		    try {
		      int array[] = new int[10];
		      array[10] = 30 /0;
		    } 
		    catch (ArithmeticException e)
		    {
		      System.out.println(e.getMessage());
		    } 
		    catch (ArrayIndexOutOfBoundsException e) 
		    {
		      System.out.println(e.getMessage());
		    } 
		  }
	}


