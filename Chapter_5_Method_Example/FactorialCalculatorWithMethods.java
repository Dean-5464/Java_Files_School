
/**
 * A factorial calculator that features methods
 *
 * Dean Kammerer
 * 9/1/2020
 */

import java.util.Scanner;

public class FactorialCalculatorWithMethods
{
  public static void main(String[] args){
      
      Scanner sc = new Scanner(System.in);
      
      displayWelcome();
    
      String firstName = getUserInput(sc, "Enter first name");
      String lastName = getUserInput(sc, "Enter last name");
      
      //perform calculation
      String choice = "y";
      while(choice.equalsIgnoreCase("y")){
          
          //get int from user
          int num = Integer.parseInt(getUserInput(sc, "Enter integer between 0 and 10"));
          
          System.out.println("The Factorial of " + num + " is " + calculateFactorial(num));
          
          choice = getUserInput(sc, "Continue? (Y/N): ");
          System.out.println();
      }
      
    }   // end of main method
  
  public static long calculateFactorial(int num){
      long factorial = 1;
      
      for(int i = 1; i <= num; i++){
         
          factorial *= i;
          
        }
      
      return factorial;
    }
    
  public static String getUserInput(Scanner sc, String prompt){
  
      System.out.println(prompt);
      String value = sc.next();
      
      return value;
  }
    
  public static void displayWelcome(){
      System.out.println("Welcome to the Factorial Calculator.");
    }   // end of welcome method
    
}
