// Make a program that prints the table of a number that is input by the user. (HINT - You will have to write 10 lines for this program)

package meet_java_fundamentals.L02_variables_datatypes;

import java.util.*;
public class Q3_PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();
        System.out.println("The multiplication table of the number (" + number + ") is: ");
        System.out.println(number + " x 1  = " + (number * 1));
        System.out.println(number + " x 2  = " + (number * 2));
        System.out.println(number + " x 3  = " + (number * 3));
        System.out.println(number + " x 4  = " + (number * 4));
        System.out.println(number + " x 5  = " + (number * 5));
        System.out.println(number + " x 6  = " + (number * 6));
        System.out.println(number + " x 7  = " + (number * 7));
        System.out.println(number + " x 8  = " + (number * 8));
        System.out.println(number + " x 9  = " + (number * 9));
        System.out.println(number + " x 10 = " + (number * 10));
    }
}
