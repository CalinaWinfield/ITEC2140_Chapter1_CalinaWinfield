/**Class: Circle
 * @author Calina Winfield
 * @version 1.0
 * Course: ITEC 2140 section 03 Spring 2024
 * Written: January 16, 2024
 *
 * This class - displays the area and
 * perimeter of a Circle that has a radius
 * of 9.5 using the following formula:
 * area = radius * radius * Math.PI
 * perimeter = 2 * radius * Math.PI
 */

public class Circle {
    public static void main(String[] args){
        //Use double for decimal numbers
        double radius = 9.5;
        //Calculate the area and perimeter of 9.5 radius circle using Math.PI
        double area = radius * radius * Math.PI;
        double perimeter = 2 * radius * Math.PI;

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

    }
}
