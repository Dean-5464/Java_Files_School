
/**
 * An application that allows a student to enter registration information
 *
 * Dean Kammerer
 * 9/7/2020
 */

import java.util.Scanner;

public class studentRegistration{
    public static void main(String[] args){
   
        Scanner sc = new Scanner(System.in);
        
        String firstName = "";
        String lastName = "";
        String birthYear = "";
        
        System.out.println("Student Registration Form");
        printBlank();   //Blank line method
        
        //First name prompt
        System.out.print("Enter first name: ");
        firstName = sc.next();
        printBlank();
        
        //Last name prompt
        System.out.print("Enter last name: ");
        lastName = sc.next();
        printBlank();
        
        //Birth year prompt
        System.out.print("Enter year of birth: ");
        birthYear = sc.next();
        printBlank();
        
        //Console output results
        System.out.println("Welcome " + firstName + " " + lastName + "!");
        System.out.println("Your registration is complete.");
        System.out.println("Your temporary password is: " + lastName + "*" + birthYear);
}
    
    //Prints a blank line to the console (ease of use)
    public static void printBlank(){
        System.out.println("");
    }

}