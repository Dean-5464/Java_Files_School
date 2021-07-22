
/**
 *  An application that converts temperature values from Fahrenheit to Celsius
 *
 * Dean Kammerer
 * 9/7/2020
 */


import java.util.Scanner;
import java.text.NumberFormat;

public class temperatureConverterApp
{
    public static void main(String args[]){
     
        Scanner sc = new Scanner(System.in);
        
        double fahrenheit;
        double celsius;
        
        //Formatting variable
        String conversion;
        
        //Loop continuation variable
        String keepGoing = "y";
        
        //Welcome message
        System.out.println("Welcome to the Temperature Converter");
        printBlank();   //Blank line method
        
        //Main loop
        while(keepGoing.equalsIgnoreCase("y")){
            //user input
            System.out.print("Enter degrees in Farenheit: ");
            fahrenheit = sc.nextDouble();
            
            //Conversion
            celsius = (fahrenheit - 32) * 5/9;
            
            //Formatting
            NumberFormat number = NumberFormat.getNumberInstance();
            number.setMaximumFractionDigits(2);
            
            //Conversion with correct formatting
            conversion = number.format(celsius);
            
            
            System.out.print("Degrees in Celsius: " + conversion);
            printBlank();
            
            //User prompt to run loop again
            System.out.print("\nContinue? (y/n): ");
            keepGoing = sc.next();
            printBlank();
            
        }
     
     
     
    }
    
    //Prints a blank line to the console (ease of use)
    public static void printBlank(){
        System.out.println("");
    }
}
