
/**
 *  An application that rolls a pair of six-sided dice.
 *
 * Dean Kammerer
 * 9/7/2020
 */


import java.util.Scanner;

public class diceRollerApp
{
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int die1;
        int die2;
        int total;
        
        String PROMPT = "Roll again? (y/n): ";
        String input = "y";
        
        //Welcome message
        System.out.println("Dice Roller");
        printBlank();   //Blank line method
        
        //main loop
        while(input.equalsIgnoreCase("y")){
            
            //Calls on the random die roll method to obtain a number between 1 and 6
            die1 = rollDie();
            die2 = rollDie();
            
            //Calls the print dice method to print the dice to the console
            printDice(die1, die2);
            
            //Calculates the Total and displays it to the console
            total = die1 + die2;
            System.out.println("Total: " + total);

            //Calls the print special message method
            printSpecialMessage(total);
            
            //Calls the getUserChoice method and assigns the termination veriable to it's return
            input = getUserChoice(sc, PROMPT);
            
        }
        
    }
    
    private static String getUserChoice(Scanner sc, String PROMPT){
        
        //Displays the constant PROMPT, retrieves, and returns the user input form the colsole
        System.out.print(PROMPT);
        String userInput = sc.next();
        printBlank();
        return userInput;
        
    }
    
    public static int rollDie(){
        
        //returns the dice roll as a random number between 1 and 6
        int roll = (int)(Math.random() * 6) + 1;
        
        return roll;
    }
    
    
    public static void printDice(int die1, int die2){
        
        //Prints the dice out on two seperate lines
        System.out.println("Die 1: " + die1);
        System.out.println("Die 2: " + die2);
    }
    
   
    private static void printSpecialMessage(int total){
        
        //Logic check
        if(total == 2){
            System.out.println("Snake eyes!");
        }else if(total == 12){
            System.out.println("Boxcars!");
        }
        
        printBlank();
        
    }
    
   
    //Prints a blank line to the console (ease of use)
    public static void printBlank(){
        System.out.println("");
    }
}

