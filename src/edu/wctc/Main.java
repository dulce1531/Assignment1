package edu.wctc;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String options[][] = {{"mild", "spicy"},
                {"tea", "coffee"},
                {"breakfast", "brunch"},
                {"summer", "winter"},
                {"paper", "plastic"}};
        int answers[] = new int[options.length];
        boolean bool = true;

        while (true) {
            System.out.println("Enter 0 for the preference on the left\n" +
                    "Enter 1 for the preference on the right");
            for (int i = 0; i < options.length; i++) {
                System.out.println("Do you prefer "+options[i][0]+ " or " + options[i][1]
                        + "?");
                answers[i] = scanner.nextInt();
            }

            int result = getScore(answers);
            if (result < 3)
                System.out.println("You prefer life to be calm and organized");
            else if (result > 3)
                System.out.println("You prefer life to be spontaneous and active.");
            else
                System.out.println("You prefer a good balance in life");

            System.out.println("Enter 0 to exit program or 1 to run again");

            int out = scanner.nextInt();

            if (out == 0)
                bool = false;
            if (!bool)
                System.exit(0);
        }
    }
    static int getScore(int []answers){
        int score=0;
        for (int answer : answers) if (answer == 1) score++;
        return score;
    }
}


