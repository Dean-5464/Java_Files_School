
/**
 * Factorial Calculator App
 *
 * Dean Kammerer
 * 9/1/2020
 */

import java.util.Scanner;

public class FactorialCalculatorApp
{
 
    // main method
    public static void main(String [] args){
        System.out.println("Welcome to the Factorial Calculator.\n");
        
        // Create scanner object
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";    // loop control variable
        
        while(choice.equalsIgnoreCase("y")){
            
            System.out.print("Enter an interger between 0 and 10\n");
            
            int num = sc.nextInt();
            
            // calculate factorial number
            long factorial = 1;
            
            for(int i = 1; i <= num; i++){
                factorial *= i;
            }
            
            // display result
            System.out.println("The factorial of " + num + " is " + factorial + "\n");
            
            // modify loop control variable
            System.out.print("Continue? (Y/N): ");  // prompt
            choice = sc.next();
            System.out.println();   // blank line
            
            
            
        }
        
        
        
        
        
    }
    
    
}
