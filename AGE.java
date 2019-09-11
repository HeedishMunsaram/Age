import java.util.Scanner;
/**
 * 
 */

/**
 * @author Andish
 *
 */
public class AGE {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
        int age;
        boolean valid;
        do
        {
          System.out.println("How old are you?");
          age = keyboard.nextInt();
          valid = (age > 0) && (age < 125);
          if (!valid)
        	  System.out.println("error! try again!");
        }
        while (!valid);
        
        keyboard.close();
        
	}

}
