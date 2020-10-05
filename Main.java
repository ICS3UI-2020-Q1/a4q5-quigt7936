import java.util.Scanner;
/**
 * This program performs the hailstone pattern
 * @author Thomas Quigley
 */
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // ask and initialize n
    System.out.println("Please enter a positive integer to see the hailstone sequence.");
    int theNumber = input.nextInt();

    // declare the even and odd deciding variable, if evenOdd = 0 then the number is even and if the evenOdd = 1 then the number is odd
    int evenOdd;

    // create a loop that ends when n = 1
    do {
      // tell them the number were on
      System.out.println(theNumber);

      // give the evenOdd variable value based on the new number
      evenOdd = theNumber % 2;
      
      // see if the number is even or odd, then do what the patterns tells us to do.
      if (evenOdd == 0) {
        theNumber = theNumber / 2;
      } else {
        theNumber = theNumber * 3 + 1;
      }
    } while (theNumber != 1);
    
  }
}
