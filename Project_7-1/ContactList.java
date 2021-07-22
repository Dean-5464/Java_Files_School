
/**
 * An application that uses a class to store and display contact information.
 *
 * Dean Kammerer
 * 9/14/2020
 */
public class ContactList{
 
    public static void main(String args[]){
        
        //User Control Variable
        String keepGoing = "Y";
        
        //Display welcome message using the method below
        displayWelcomeMessage();
        
        Contact firstContact = new Contact();
        
        String userInput = "";
        
        while (keepGoing.equalsIgnoreCase("Y")){
            
            //Update contact class entries
            userInput = Console.getString("Enter first name: ");
            firstContact.setFirstName(userInput);
            
            userInput = Console.getString("Enter last name: ");
            firstContact.setLastName(userInput);            

            userInput = Console.getString("Enter email address name: ");
            firstContact.setEmail(userInput);
            
            userInput = Console.getString("Enter Phone Number name: ");
            firstContact.setPhoneNumber(userInput);
            
            //Display updated contact
            firstContact.displayContact();
            
            //Ask user to see if they want to continue
            keepGoing = Console.getString("Continue? (Y/N): ");
            
        }
          
    }
    
    //Display welcome message
    public static void displayWelcomeMessage(){
        System.out.println("Welcome to the Contact List application");
        printBlankLine();
    }
    
    //Print blank line to the console (ease of use)
    public static void printBlankLine(){
        System.out.println("");
    }
    
}
