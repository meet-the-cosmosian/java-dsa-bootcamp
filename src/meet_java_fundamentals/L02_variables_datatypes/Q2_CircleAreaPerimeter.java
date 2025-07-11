// Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

package meet_java_fundamentals.L02_variables_datatypes;

import java.util.Scanner;
public class Q2_CircleAreaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        
        double perimeter = 2 * Math.PI * radius;
        double area = Math .PI * radius* radius;
        
        System.out.println("The area of the circle whose radius("+ radius + "): " + area);
        System.out.println("The perimeter of the circle whose radius("+ radius + "): " + perimeter);
    }
}
