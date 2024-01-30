/**Class: Chocolate
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: January 16, 2024
 *
 * This class - computes the number of
 * bags you will need to add three
 * chocolates instead of two chocolates.
 */

public class Chocolate {
    public static void main(String[] args) {
        //For this program, I asked ChatGPT for assistant
        //I knew the math that needed to be done, but couldn't think of how to type it into a program.
        //I did, however, make some adjustments to the assistance that I received.
        int initialBags = 9;
        int initialBarsPerBag = 2;
        int newBarsPerBag = 3;
        // Calculate the total number of chocolate bars in the initial configuration
        int initialTotalBars = initialBags * initialBarsPerBag;
        // Calculate the number of bags needed to accommodate the new number of chocolate bars
        int newBags = initialTotalBars / newBarsPerBag;

        System.out.println("You will need " + newBags + " bags to add " + newBarsPerBag + " chocolate bars to each bag.");
    }
}
