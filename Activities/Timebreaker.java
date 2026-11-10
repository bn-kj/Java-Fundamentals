import java.util.Scanner;

/**
 * Timebreaker
 */
public class Timebreaker {

    public static final int HOUR = 3600;
    public static final int MINUTE = 60;
    public static final int SECOND = 1;

    public static void main(String[] args) {
        var stdin = new Scanner(System.in); 

        System.out.print("Enter Value in Seconds: ");
        int input_seconds = stdin.nextInt();
        int hours = 0, minutes = 0, seconds = 0;

        hours += input_seconds / HOUR;
        input_seconds %= HOUR;

        minutes += input_seconds / MINUTE;
        input_seconds %= MINUTE;

        seconds = input_seconds;

        System.out.println("Hour(s): " + hours);
        System.out.println("Minute(s): " + minutes);
        System.out.println("Second(s): " + seconds);

        stdin.close();
    }
}
