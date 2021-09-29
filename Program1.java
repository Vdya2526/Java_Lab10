package lab10;

import java.util.Scanner;

/*to create user defined exception we must need inherit from exception class*/

public class Program1 extends Exception {

	
	Program1()
    {
        super("Odd number exception");
    }
    Program1(String msg)
    {
        super(msg);
    }
	
	
public static void main(String[] args) throws Program1 {
	System.out.println("Enter any number");
	Scanner sc= new Scanner(System.in);
	     int num = sc.nextInt();
	     try {
	    	 
	     
	      if(num%2!=0)
	      
	    	  throw(new Program1());//when number is odd throw keyword will be picked and it will execute the program1 exception message and catch block will be executed
	    	  else
	    		  System.out.println("its an even number");
	      
	     }
	     catch(Program1 Ex)
         {
             System.out.print(Ex.getMessage());
         }

         System.out.print("\n\tEnd of program");
	
		
	}

}
