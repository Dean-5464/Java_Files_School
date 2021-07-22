/**
 *  an application that lets a user guess a number between 1 and 100.
 *
 * Dean Kammerer
 * 9/14/2020
 */


import java.util.Scanner;

public class GuessNumberApp 
{
    
    public static void main(String[] args) 
    {
        //Variables
        int guess = 0;
        int guessAttempt = 0;
        String userInput = "";
        String keepGoing = "Y";
        
        //Call method to display welcome message
        displayWelcomeMessage();     
        
        // create the Scanner object
        Scanner sc = new Scanner(System.in);
                
        //create a loop to allow user to play again        
        while (keepGoing.equalsIgnoreCase("Y")){
        
        //main Loop starts
            
            //reset counter variable
            guessAttempt = 0;
        
            // generate the random number 
            int randomNumber = getRandomNumber();
            
            //display Please Guess Message
            System.out.println("");
            displayPleaseGuessMessage();
            
                // continue until the user guesses the number
                //inner loop start
 
            boolean isCorrect = false;        
            while (isCorrect == false){
                //add 1 to current attempt number
                guessAttempt++;
                
                // get a valid int from user
                guess = getIntWithinRange(sc, "Please enter a number between 1 and 100: ",0 , 101);
               
                // display result of guess to user
                if(guess != randomNumber){
                    displayGuessAgainMessage(randomNumber, guess);
                }else{
                    displayCorrectGuessMessage(guessAttempt);
                    isCorrect = true;
                }
                
                //inner loop ends    
            }

            // see if the user wants to continue
            keepGoing = getChoiceString(sc, "Play again? (Y/N): ", "Y", "N");
            
            
        //main loop end  
    }
    
        System.out.println("Bye - Come back soon!");
        System.out.println();
        
    }

    private static void displayWelcomeMessage() {
        System.out.println("Welcome to the Guess the Number Game");
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println();
    }
    
    private static int getRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
    
    private static void displayPleaseGuessMessage() {
        System.out.println("I'm thinking of a number from 1 to 100.");
        System.out.println("Try to guess it.");
        System.out.println();
    }
    
    private static void displayCorrectGuessMessage(int counter) {
        System.out.println("You got it in " + counter + " tries.");
        if (counter <= 3) {
            System.out.println("Great work! You are a mathematical wizard.\n");
        } else if (counter > 3 && counter <= 7) {
            System.out.println("Not too bad! You've got some potential.\n");
        } else {
            System.out.println("What took you so long? Maybe you should take some lessons.\n");
        }
    }
    
    private static void displayGuessAgainMessage(int number, int guessNumber) {
        int difference = guessNumber - number;
        if (guessNumber > number) {
            if (difference > 10) {
                System.out.println("Way too high! Guess again.\n");            
            } else {
                System.out.println("Too high! Guess again.\n");
            }
        } else {
            if (difference < -10) {
                System.out.println("Way to low! Guess again.\n");
            } else {
                System.out.println("Too low! Guess again.\n");
            }
        }
    }

    private static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                i = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("Error! Invalid integer value. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    private static int getIntWithinRange(Scanner sc, String prompt,
            int min, int max) {
        int i = 0;
        boolean isValid = false;
        while (!isValid) {
            i = getInt(sc, prompt);
            if (i <= min) {
                System.out.println("Error! Number must be greater than " + min);
            } else if (i >= max) {
                System.out.println("Error! Number must be less than " + max);
            } else {
                isValid = true;
            }
        }
        return i;
    }

    private static String getRequiredString(Scanner sc, String prompt) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s.equals("")) {
                System.out.println("Error! This entry is required. Try again.");
            } else {
                isValid = true;
            }
        }
        return s;
    }

    private static String getChoiceString(Scanner sc, String prompt,
            String s1, String s2) {
        String s = "";
        boolean isValid = false;
        while (!isValid) {
            s = getRequiredString(sc, prompt);
            if (!s.equalsIgnoreCase(s1) && !s.equalsIgnoreCase(s2)) {
                System.out.println("Error! Entry must be '" + s1 + "' or '" + s2 + "'. Try again.");
            } else {
                isValid = true;
            }
        }
        return s;
    }
}