
/**
 * Write a description of class StudentApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentApp
{
 public static void main(String[] args){
     
     System.out.println("Welcome to the Student Class List\n");
     
     String choice = "y";
     while(choice.equalsIgnoreCase("y")){
         
         //Create instance of object
         Student student = new Student();   //call default constructor
         Student student2 = new Student("Sally", "Smith", "IT", 23);
         
         String first = Console.getString("Enter first name: ");
         student.setFirstName(first);
         
         student.setLastName(Console.getString("Enter last name: "));
         
         student.setMajor(Console.getString("Enter major: "));
         
         student.setAge(Console.getInt("Enter age: ", 17, 99));
         
         System.out.println();
         System.out.print(student.displayStudent());
         System.out.println();
         System.out.print(student2.displayStudent());         
         System.out.println();
         
         choice = Console.getString("Continue? (y/n): ");
         System.out.println();
         
     }
     
     
 }
}
