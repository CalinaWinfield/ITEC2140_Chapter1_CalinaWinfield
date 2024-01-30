/**Class: Cycle
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: January 16, 2024
 *
 * This class - computes the total number of tricycles at the shop.
 */

public class Cycle {
    public static void main(String[] args) {
        int TotalBicycles = 10;
        int TotalCycleWheels = 47;
        int BicycleWheelNum = 2;
        int TricycleWheelNum = 3;
        // Calculate the total number of wheels on the bicycles and tricycles
        int TotalBicycleWheels = TotalBicycles * BicycleWheelNum;
        int TotalTricycleWheels = TotalCycleWheels - TotalBicycleWheels;
        // Calculate the number of tricycles from the number of tricycle wheels
        int TotalTricycles = TotalTricycleWheels / TricycleWheelNum;

        System.out.println("The Cycle Shop has " + TotalTricycles + " tricycles.");
    }
}
