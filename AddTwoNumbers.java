import java.util.Scanner;

/**
 * AddTwoNumbers
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int num1, num2, sum;

        System.out.println("Enter First Number: ");
        num1 = stdin.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = stdin.nextInt();

        sum = num1 + num2;
        System.out.println("Sum = " + sum);

        stdin.close();
    }
}
