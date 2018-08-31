/** example of a sentinel loop
 * Author: David G. Cooper
 * Date: August 31, 2013
 * Course: CIS 213
 * Purpose: This program is an example of text interaction. Concepts Used:
 *          1. Console Input (using java.util.Scanner and System.in)
 *          2. Console Output (using System.out)
 *          3. Loops (while loop with a sentinel value)
 *          4. Conditional Execution (using if,else if, else)
 *          5. Exception handling (using try/catch)
 *          6. Variables - declaration, initialization, assignment,
 *                         basic data types, and Objects.
 */
import java.util.Scanner;

// every program must have a class and a main method
public class Example4 { // class name should match file name
    public static void main(String[] args) { // main method
        Scanner s = new Scanner(System.in); // for input from the console
        boolean go = true; // sentinel value
        float sum = 0.0f; // keep track of the running total
        int count = 0; // keep track of the number of rational numbers

        // Welcome message for text interaction.
        System.out.println("Welcome to the averaging tool." +
                           "Type 'q' to quit or an empty line to compute the average");
        while(go) { // loop until go is false
            System.out.print("enter a number: "); // repeating prompt
            String input = s.nextLine(); // get the next line of input
            if(input.toLowerCase().contains("q")) { // any place there is a 'q'
                return; // quit
            } else if (input.length() == 0) { // just enter was typed
                go = false;
            } else { // hopefully a number
                try{ // code for when input is a number
                    float number = Float.parseFloat(input);
                    sum += number;
                    count++;
                } catch (NumberFormatException nfe) { // code for when it's not a number
                    System.out.println(input + " is not a number, did not add.");
                }
            }
        }
        // output result
        System.out.println("The average of the numbers you entered is: " +
                           (sum / count));
        
    } // end of main is end of program.
} // end of class
