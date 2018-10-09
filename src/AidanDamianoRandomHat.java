import java.util.Scanner;

public class AidanDamianoRandomHat {
    public static void main(String[] cheese) {
        Scanner console = new Scanner(System.in);
        System.out.print("How many teams? ");
        int teamNumb = console.nextInt();
        while ((teamNumb/2) * 2 != teamNumb) {
            System.out.print("Please choose an even number: ");
            teamNumb = console.nextInt();
        }
        String[] teams = new String[teamNumb];
        fillArray(teams, teamNumb);
    }

    public static void fillArray(String[] teams, int teamNumb) {
        for (int x = 1; x <= teamNumb; x++) {
            teams[x -1] = "Team " + x;
        }
        pickTeams(teams, teamNumb);
    }

    public static void pickTeams(String[] teams, int teamNumb) {
        int y = 0;
        int w;
        String cheese;
        String[] match = new String[2];
        boolean run = true;
        match[0] = "0";
        match[1] = "0";

        for (int x = 1; x <= teamNumb/2; x++) {
            run = true;
            while (run) {
                w = (int) (Math.random() * teamNumb);

                if (teams[w].equals("0")) {
                    run = true;
                } else {
                    run = false;
                    if (!match[1].equals("0")) {

                        System.out.println("Match " + x / 2 + ": " + match[0] + " vs " + match[1]);
                        match[0] = "0";
                        match[1] = "0";

                    }
                        if (match[0].equals("0")) {
                            match[0] = teams[w];
                            teams[w] = "0";

                        } else if (match[1].equals("0")){
                            match[1] = teams[w];
                            teams[w] = "0";


                        }
                    }


            }

        }


    }
}
