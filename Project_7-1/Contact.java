
public class Contact
{
 
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    
    
 public Contact(){
     //Default
    }
    

 public Contact(String f,String l,String e,String p){
     firstName = f;
     lastName = l;
     email = e;
     phoneNumber = p;
    }
    
 public void setFirstName(String name){
     firstName = name;
    }
    
 public String getFirstName(){
     return firstName;
    }
    
 public void setLastName(String name){
     lastName = name;
    }
    
 public String getLastName(){
     return lastName;
    }
    
 public void setEmail(String emailAddress){
     email = emailAddress;
    }
    
 public String getEmail(){
     return email;
    }
    
 public void setPhoneNumber(String phone){
     phoneNumber = phone;
    }
    
 public String getphoneNumber(){
     return phoneNumber;
    }
    
 public void displayContact(){
     System.out.println("----------------------------------------------------");
     System.out.println("Current Contact");
     System.out.println("Name: " + firstName + " " + lastName);
     System.out.println("Email Address: " + email);
     System.out.println("Phone Number: " + phoneNumber);
     System.out.println("----------------------------------------------------");
    }
}
