
//This Program Takes User Input and Chooses Random Pairs Of Teams Without Replacement.

import java.util.Scanner;


public class AidanDamianoRandomHat {
    //Never use ARGS
    public static void main(String[] cheese) {

        Scanner console = new Scanner(System.in);

        System.out.print("How many teams? ");

        int teamNumb = console.nextInt();
//Keeps asking user until they choose an even number
        while ((teamNumb / 2) * 2 != teamNumb) {

            System.out.print("Please choose an even number: ");

            teamNumb = console.nextInt();

        }
//Creates array of teams
        String[] teams = new String[teamNumb];

        fillArray(teams, teamNumb);

    }

    //This method fills the array with strings
    public static void fillArray(String[] teams, int teamNumb) {

        for (int x = 1; x <= teams.length; x++) {

            teams[x - 1] = "Team " + x;

        }

        pickTeams(teams, teamNumb);

    }

    //This method picks random teams and prints each match
    public static void pickTeams(String[] teams, int teamNumb) {


        int w;


        String[] match = new String[2];

        boolean run = true;

        match[0] = "0";

        match[1] = "0";

//This for loop prints the matches
        for (int x = 1; x <= teamNumb; x++) {

            run = true;

            while (run) {

                w = (int) (Math.random() * teamNumb);

//Makes sure it does not choose the same team twice
                if (teams[w].equals("0")) {

                    run = true;

                } else {

                    run = false;


                    if (match[0].equals("0")) {

                        match[0] = teams[w];

                        teams[w] = "0";


                    } else if (match[1].equals("0")) {

                        match[1] = teams[w];

                        teams[w] = "0";

                        System.out.println("Match " + x / 2 + ": " + match[0] + " vs " + match[1]);

                        match[0] = "0";

                        match[1] = "0";

                    }

                }


            }


        }


    }

    public static int mode(int hi) {
        return 0;
    }

}
