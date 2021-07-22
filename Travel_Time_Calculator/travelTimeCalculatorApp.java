
/**
 * Write a description of class travelTimeCalculatorApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class travelTimeCalculatorApp
{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        
        while(choice.equalsIgnoreCase("y")){
            
            System.out.print("Enter miles: \t");
            
            double miles = sc.nextDouble();
            
            System.out.print("Enter miles per hour: \t");
            double mph = sc.nextDouble();
            
            //Calculate travel time in hours
            double hours = miles/mph;
            
            //get number of minutes
            int minutes = (int) (hours * 60);
            
            int hoursInt = minutes / 60;    //9/5 = 1
            
            minutes = minutes % 60; //Modulus operator (%)  9%5 = 4
            
            System.out.print("Your travel time is: " + hoursInt + " Hours, and " + minutes + " Minutes." + "\n");
            
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
}