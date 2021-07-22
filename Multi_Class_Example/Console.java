
/**
 * Use to enter values into program from console
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Console{
    //no main method
    private static Scanner sc = new Scanner(System.in); //global
    
    public static String getString(String prompt){
        
        System.out.print(prompt);
        String s = sc.next();   //Read user entry
        sc.nextLine();  //clear input buffer
        return s;
        
    }
    
    public static int getInt(String prompt){
        
        int i = 0;
        boolean isValid = false;
        
        while(!isValid){
            System.out.print(prompt);
            
            if(sc.hasNextInt()){
                
                i = sc.nextInt();
                isValid = true;
                
            } else {
                
                System.out.println("Error: Invalid Integer. Try again");
                
            }
            
            sc.nextLine();  // Clear input buffer
            
    }
     
    return i;
    
 }
 
 public static int getInt(String prompt, int min, int max){
     
     int i = 0;
     boolean isValid = false;
     
     while(!isValid){
         
         i = getInt(prompt);
         if(i <= min){
             System.out.println("Error: Enter value geater than " + min);
         }else if (i >= max){
             System.out.println("Error: Enter value less than " + max);
         }else{
             isValid = true;
         }
         
     }
          
     return i;
     
 }
 
}
