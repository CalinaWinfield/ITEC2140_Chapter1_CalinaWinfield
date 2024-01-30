/**Class: Stamps
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: January 16, 2024
 *
 * This class - computes the difference between
 * Jean’s and Susan’s collections of the stamps.
 */

public class Stamps {
    public static void main(String[] args){

        int SusanStamp = 8;
        int JeanStamp = 40;
        //Subtract Susan's stamp collection size from Jean's collection
        String StampDifference = JeanStamp - SusanStamp + (".");

        System.out.println("The difference between Jean's and Susan's stamp collections is " + StampDifference);

    }
}
