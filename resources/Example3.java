/** example of 2 way decision with a block that can never be reached.
 * Author: David G. Cooper
 * Date: August 31, 2013
 * Course: CIS 213
 * Purpose: This program is an example of conditional execution Concepts Used:
 *          1. initialization 
 *          2. arithmetic
 *          3. Conditional Execution (using if,else if, else)
 *          5. code blocks that are unreachable
 *     
 */

public class Example3 {
    public static void main(String[] args) {
        int x = 0; // declare x as an integer and initialize it to 0.
        if (x < 0) { // if x is negative
            int y = -x;
        } else if (x >= 0) { // if x is not negative
            // this covers everything else 
        } else { // nothing is left
            // this will never be executed unless the above conditions change.
        }
    }
}
