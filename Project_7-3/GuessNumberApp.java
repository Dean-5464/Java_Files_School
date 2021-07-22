import java.util.Scanner;

public class GuessNumberApp {
    
    public static void main(String[] args) {
        int guessNumber = 0;
        int counter = 1;
        
        Game game = new Game(counter, guessNumber);
        game.displayWelcomeMessage();

        // create the Scanner object
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // generate the random number and invite user to guess it
            int number = game.getRandomNumber();  
            game.displayPleaseGuessMessage();

            // continue until the user guesses the number
            guessNumber = 0;
            counter = 1;
            while (guessNumber != number) {
                // get a valid int from user
                guessNumber = Console.getIntWithinRange(sc, "Enter number: ", 0, 101);

                // display result of guess to user
                if (guessNumber == number) {
                    game.displayCorrectGuessMessage(counter);
                } else {
                    game.displayGuessAgainMessage(number, guessNumber);
                }
                counter++;
            }

            // see if the user wants to continue
            choice = Console.getChoiceString(sc, "Try again? (y/n): ", "y", "n");
            System.out.println();
        }
        System.out.println("Bye - Come back soon!");
        System.out.println();
    }

    
}