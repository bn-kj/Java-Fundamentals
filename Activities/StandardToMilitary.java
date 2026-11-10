package Activities;

import java.util.Scanner;

/**
 * StandardToMilitary
 */
public class StandardToMilitary {

    public static final int AM = 1;
    public static final int PM = 2;

    public static void main(String[] args) {
        var stdin = new Scanner(System.in);

        System.out.print("Hour(s): ");
        var hours = stdin.nextInt();

        System.out.print("Minute(s): ");
        final int minutes = stdin.nextInt();

        System.out.print("AM|PM: ");
        final int meridian = stdin.nextInt();

        if (meridian == PM) hours += 12;

        System.out.printf("%02d%02d\n", hours, minutes);
        stdin.close();
    }
}
