import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPracticeP2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        userInput(console);
    }

    public static void userInput(Scanner console) {
        System.out.print("How many days' temperatures? ");
        int days = console.nextInt();
        int[] temps = new int[days + 1];
        dayTemps(days, console, temps);
    }

    public static void dayTemps(int days, Scanner console, int[] temps) {
        int highSum = 0;
        int dayHigh;
        for (int x = 1; x <= days; x++) {
            System.out.print("Day " + x + "'s high temp: ");
            dayHigh = console.nextInt();
            temps[x] = dayHigh;
            highSum += dayHigh;
        }
        double averageTemp = (Math.round((1.0 * highSum) / (1.0 * days)) * 100.0) / 100.0;
        System.out.println("Average temp = " + averageTemp);
        int daysAbove = 0;
        for (int x = 1; x <= days; x++) {
            if (temps[x] > averageTemp) {
                daysAbove++;
            }
        }
        System.out.println(daysAbove + " days were above average.");
        /*
        System.out.print("Tempuratures: ");

        System.out.println(Arrays.toString(temps));
        System.out.println("Two coldest days");

        */
    }
}
