import java.util.Random;
import java.util.Scanner;

public class NumberGame
{
    public static void main(String[] args)
    {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int hiddenNumber;
        int maxAttempts = 7;
        int attempts;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        while (true)
        {
            hiddenNumber = random.nextInt(100 - 1 + 1) + 1;
            attempts = 0;

            System.out.println("You have to guess a number between 1 and 100");

            while (attempts < maxAttempts)
            {
                System.out.print("Guess the number: ");
                int userGuess = sc.nextInt();
                attempts++;

                if (userGuess < hiddenNumber)
                {
                    System.out.println("Higher than "+userGuess);
                }
                else if (userGuess > hiddenNumber)
                {
                    System.out.println("Lower than "+userGuess);
                }
                else
                {
                    System.out.println("Congratulations! You guessed the correct number (" + hiddenNumber + ") in " + attempts + " attempts.");
                    score++;
                    break;
                }
            }

            if (attempts >= maxAttempts)
            {
                System.out.println("Sorry,maximum number of attempts reached. The secret number was " + hiddenNumber + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String input = sc.next().toLowerCase();

            if (!input.equals("yes"))
            {
                break;
            }
        }

        System.out.println("Your final score is " + score + ".");
        System.out.println("Thanks,Good Byeee");
    }
}
