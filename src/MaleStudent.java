/**Class: MaleStudent
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: January 16, 2024
 *
 * This class - computes how many
 * students are male in this middle school.
 */

public class MaleStudent {
    public static void main(String[] args){

        int totalStudents = 389;
        int totalFemaleStu = 175;
        // Calculate the number of male students
        String totalMaleStu = totalStudents - totalFemaleStu + (".");

        System.out.println("The number of male students at this middle school is " + totalMaleStu);
    }
}
