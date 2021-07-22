public class Kne_StudentApp {

    public static void main(String[] args) {
       // display a welcome message
        System.out.println("Welcome to the Student Class List");
        System.out.println();  

        // add students until choice isn't equal to "y" or "Y"
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // create a new contact object
            Student student = new Student();
            
            // get contact data from the user
            String first = Console.getString("Enter first name:\t");
            student.setFirstName(first);
            
            String last = Console.getString("Enter last name:\t");
            student.setLastName(last);
            
            String major = Console.getString("Enter major:\t\t");
            student.setMajor(major);
            
            int age = Console.getInt("Enter age:\t\t", 17, 99);
            student.setAge(age);           

            // display the contact
            System.out.println();
            System.out.print(student.displayStudent());
            System.out.println();

            // see if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            System.out.println();
        }  
    }
}
