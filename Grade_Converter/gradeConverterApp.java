
/**
 * An application that converts number grades to letter grades
 *
 * Dean Kammerer
 * 8/27/2020
 */


import java.util.Scanner;

public class gradeConverterApp
{
    public static void main(String[] args){
        //Display message
        System.out.println("Welcome to the Letter Grade Converter");
        System.out.println(); //Blank line
        
        //Create Scanner object
        Scanner userInput = new Scanner(System.in);
        
        //Convert number until user is done
        String choice = "y"; //loop control variable
        
        while(choice.equalsIgnoreCase("y")){
            
            System.out.print("Enter a numerical grade: ");  //Display first message
            int numericalGrade = userInput.nextInt();   //User prompt for a numerical grade
            
            String letterGrade = "";
            
            //Check for letter grade
            if(numericalGrade >= 88){
                letterGrade = "A";
            }else if(numericalGrade >= 80){
                letterGrade = "B";
            }else if(numericalGrade >= 67){
                letterGrade = "C";
            }else if(numericalGrade >= 60){
                letterGrade = "D";
            }else{
                letterGrade = "F";
            }
            
            
            //display letter grade
            System.out.println("Letter grade: " + letterGrade + "\n");
            
            //see if user wants to continue
            System.out.println("Continue? (y/n): ");    //User Prompt
            
            choice = userInput.next();   //Recieve user input
            System.out.println();   //Blank line
            
            
            
        }//End of loop
    }
        
}
