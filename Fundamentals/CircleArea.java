package Fundamentals;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * CircleArea
 */
public class CircleArea {

    static final float PI = (float) 3.14159;

    public static void main(String[] args) {
        var stdin = new Scanner(System.in);

        final float r = takeFloat(stdin, "Radius: ", "Enter a valid float.");

        final float area = getArea(r);
        System.out.println("Area: " + area);

        stdin.close();
    }

    static public float takeFloat(Scanner stdin, String input_msg, String error_msg) {
        float res;
        while (true) {
            try {
                System.out.print(input_msg);
                res = stdin.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println(error_msg);
                stdin.next();   // Throws away bad token
            }
        }

        return res;
    }

    static public float getArea(float radius) {
        return PI * (radius * radius);
    }
}
