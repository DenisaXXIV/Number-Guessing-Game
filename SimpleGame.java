import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int attempt = 1;
        int userGuessNumber = 0;
        int number = (int) (Math.random() * 99 + 1);

        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to Number Guessing Game!\n\nWe have selected a random number between 1 and 100. See if you can guess it in 10 turns or fewer. \n" +
                "We'll tell you if your guess was too high or too low.\nYou have Maximum 5 Attemp Limit. Succes!");

        do {
            System.out.println("Enter a guess number between 1 to 100\n");

            if (userInput.hasNextInt()) {
                userGuessNumber = userInput.nextInt();

                if (userGuessNumber == number)
                    System.out.println("You're right! You have to be a clairvoyant! You Win the Game!");
                else if (userGuessNumber < number)
                    System.out.println("Your Guess Number is Smaller.");
                else if (userGuessNumber > number)
                    System.out.println("Your Guess Number is Greater.");


                if (attempt == 5) {
                    System.out.println("You have exceeded the maximum attempt. Try Again");
                    break;
                }


                attempt++;
            } else {
                System.out.println("Enter a Valid Integer Number");
                break;
            }
        } while (userGuessNumber != number);
    }
}
