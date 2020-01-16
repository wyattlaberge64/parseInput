import java.util.Scanner;
public class parseInputKata {

	public class ParseInput
	{
	    public static void main (String[] args)
	    {
	    	// create a input scanner
	        Scanner in = new Scanner(System.in);
	        // have the system ask a multiplication question and tell the user how to stop. 
	        System.out.print("4 * 3 = ?  Enter \"stop\" to stop.");
	        // have the user input a String on the next line.
	        String input = in.nextLine();
	        // close the scanner
	        in.close();
	        try {
	        	// call a function to convert a interger.
	        	convertInt(input);
	        }
	        catch (NumberFormatException e)
	        {
	            if(input.equals("stop")) {
	            	System.out.print("They want to stop");
	            }
	            else {
	            	throw new NumberFormatException("This isn't a number.");
	            }
	        } 
	        
	    }

	    public static void convertInt(String s) throws NumberFormatException
	    {
	            int n = Integer.parseInt(s);
	            System.out.println("Your integer is " + n);
	    }

	}
}
