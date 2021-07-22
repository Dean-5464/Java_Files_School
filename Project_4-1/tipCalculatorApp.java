


/**
 * An application that calculates three options for an appropriate tip to leave after a meal at a
restaurant.
 *
 * Dean Kammerer
 * 9/7/2020
 */


import java.util.Scanner;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class tipCalculatorApp
{

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        //Big Decimal Constants
        BigDecimal FIRST_TIP = new BigDecimal("0.15");
        BigDecimal SECOND_TIP = new BigDecimal("0.20");
        BigDecimal THIRD_TIP = new BigDecimal("0.25");
        
        
        //Loop termination variable
        String keepGoing = "y";
        
        //Welcome Message
        System.out.println("Tip Calculator");
        printBlank();   //Blank line method
        
        //Main loop
        while(keepGoing.equalsIgnoreCase("y")){
            
            System.out.print("Cost of meal: ");
            
            //Big Decimal Declaration
            BigDecimal cost = new BigDecimal(sc.next());
            printBlank();
            
 
            //First tip amount calculation
            System.out.println("15%");
            BigDecimal firstTipAmount = cost.multiply(FIRST_TIP);
            System.out.println("Tip amount: " + firstTipAmount);
            
            //First total amount calculation
            BigDecimal firstTotalAmount = cost.add(firstTipAmount);
            System.out.println("Total amount: " + firstTotalAmount);
            printBlank();
            
            //Second tip amount calculation
            System.out.println("20%");
            BigDecimal secondTipAmount = cost.multiply(SECOND_TIP);
            System.out.println("Tip amount: " + secondTipAmount);
            
            //Second total amount calculation
            BigDecimal secondTotalAmount = cost.add(secondTipAmount);
            System.out.println("Total amount: " + secondTotalAmount);
            printBlank();
            
            //Third tip amount calculation
            System.out.println("25%");
            BigDecimal thirdTipAmount = cost.multiply(THIRD_TIP);
            System.out.println("Tip amount: " + thirdTipAmount);
            
            //Third total amount calculation
            BigDecimal thirdTotalAmount = cost.add(thirdTipAmount);
            System.out.println("Total amount: " + thirdTotalAmount);
            printBlank();
            
            //User Prompt to continue
            System.out.print("Continue? (y/n): ");
            keepGoing = sc.next();
            printBlank();
            
            
        }
        
        
    }
    
    //Prints a blank line to the console (ease of use)
    public static void printBlank(){
        System.out.println("");
    }
}
