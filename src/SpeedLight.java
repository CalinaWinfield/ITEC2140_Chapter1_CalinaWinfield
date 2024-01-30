/**Class: SpeedLight
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: January 16, 2024
 *
 * This class - calculates the distance to
 * a lightning strike based on the time elapsed
 * between the flash and the sound of thunder
 */

public class SpeedLight {
    public static void main(String[] args){

        int SpeedOfSound = 340;
        int Time = 5;
        //Calculate the distance of a lightning strike
        String Distance = SpeedOfSound * Time + ("m");
        System.out.println(Distance);

    }
}
