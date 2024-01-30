/**Class: FindX
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: January 16, 2024
 *
 * This class - computes the number
 * x based on the following formula:
 * 5 + 19 + x + 47 = 194
 */

public class FindX {
    public static void main(String[] args){

        int formulaTotal = 194;
        int formulaOtherNums = 71;
        //Calculate the value of x by subtracting the other numbers from the total
        int x = formulaTotal - formulaOtherNums;

        System.out.println("5 + 19 + x + 47 = 194\nx = " + x);

    }
}
