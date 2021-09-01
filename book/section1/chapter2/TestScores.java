package book.section1.chapter2;

import java.util.Scanner;

public class TestScores
{
    public static void main(String[] args)
    {
        System.out.println("Please enter test scores that range from 0 to 100");
        System.out.println("To end the program enter 999.");
        System.out.println();

        // initialize variables and create a scanner object
        double scoreTotal = 0.0;
        int scoreCount = 0;
        int testScore = 0;
        Scanner sc = new Scanner(System.in);

        // get a series of test scores from the user
        while (testScore >= 0 || testScore < 0)
        {
            // get the input from the user
            System.out.print("Enter score: ");
            testScore = sc.nextInt();

            // accumulate score count and score total
            if (testScore == 999) break;
            else if (testScore < 0 || testScore >= 101)
            {
                System.out.println("Please enter test scores that range from 0 to 100");
            }
            else if (testScore >= 0 && testScore <= 100)
            {
                scoreCount = scoreCount + 1;
                scoreTotal = scoreTotal + testScore;
            }
        }
        // display the score count, score total, and average score
        double averageScore = scoreTotal / scoreCount;
        String message = "\n" + "Score Count: " + scoreCount + "\n"
                            + "Score Total: " + scoreTotal + "\n"
                            + "Average Score " + averageScore + "\n";
        System.out.println(message);
        sc.close();
    }
}