import java.util.Scanner;

/**
 * AddTwoNumbers
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int num1, num2, sum;

        System.out.print("Enter First Number: ");
        num1 = a.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = a.nextInt();

        sum = num1 + num2;
        System.out.print("Sum = " + sum);

        a.close();
    }
}
