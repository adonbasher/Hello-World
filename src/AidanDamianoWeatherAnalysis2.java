//This program takes the days high temperature for a certain number of days chosen by the user.
//It then calculates the average temp and displays it along with how many days are above average

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class AidanDamianoWeatherAnalysis2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        userInput(console);
    }

    // Asks for user input and creates an array of all the temperatures
    public static void userInput(Scanner console) {
        System.out.print("How many days' temperatures? ");
        int days = console.nextInt();
        int[] temps = new int[days];
        dayTemps(days, console, temps);
    }

    // Calculates the average temperature and displays how many days were above average
    public static void dayTemps(int days, Scanner console, int[] temps) {
        int highSum = 0;
        int dayHigh;
        for (int x = 1; x <= days; x++) {
            System.out.print("Day " + x + "'s high temp: ");
            dayHigh = console.nextInt();
            temps[x-1] = dayHigh;
            highSum += dayHigh;
        }
        double averageTemp = ((Math.round((double) highSum / (double) days * 10.0)) / 10.0);
        ;
        System.out.println("Average temp = " + averageTemp);
        int daysAbove = 0;
        for (int x = 1; x <= days; x++) {
            if (temps[x-1] > averageTemp) {
                daysAbove++;
            }
        }
        System.out.println(daysAbove + " days were above average.");
        System.out.println();
        System.out.print("Temperatures: ");
        System.out.print(Arrays.toString(temps));

        hotCold(temps);
    }
    public static void hotCold(int[] temps) {
        Arrays.sort(temps);
        System.out.println();
        System.out.println("Two coldest days: " + temps[0] + ", " + temps[1]);
        System.out.println("Two hottest days: " + temps[temps.length - 1] + ", " + temps[temps.length - 2]);



    }
}
