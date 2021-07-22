import java.util.Scanner;
public class GradeApp {
 public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);

 // display a welcome message
 System.out.println("Welcome to the Letter Grade Converter");
 System.out.println(); // print a blank line

 // perform conversions until choice isn't equal to "y" or "Y"
 String choice = "y";
 while (choice.equalsIgnoreCase("y")) {
 // get numerical grade from user
 System.out.print("Enter numberical grade: ");
 int number = sc.nextInt();
 Grade grade = new Grade(number);
 // display the result of the conversion
 System.out.println("Letter grade: " + grade.getLetter() + "\n");
 // see if the user wants to continue
 System.out.print("Continue? (y/n) ");
 choice = sc.next();
 System.out.println();
 }
 }

}