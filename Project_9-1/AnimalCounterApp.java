import java.util.concurrent.TimeUnit;
/**
 * The main class of the Animal Counter, calls all of the methods and classes that are required
 * or requested.
 *
 * Dean Kammerer
 * 9/21/2020
 */
public class AnimalCounterApp
{

    public static void main(String[] args){
        
        countAlligators();
        countSheep();
        
    }
    
    public static void countAlligators(){
        System.out.println("Counting Alligators ...");
        
        Alligator alligator = new Alligator();
        
        count(alligator, getAnimalCount());
    }
    
    public static void countSheep(){
        System.out.println("Counting Sheep ...");
        
        Sheep molly = new Sheep("Molly");
        count(molly, getAnimalCount());
        
        Sheep billy = new Sheep();
        billy.setName("Billy");
        count(billy, getAnimalCount());
        
        Sheep wolly = new Sheep();
        count(wolly, getAnimalCount());
    }
    
    public static void count(Countable c, int maxCount){
        
        c.resetCount();
        while(c.getCount() <= maxCount){
            
            System.out.println(c.getCountString());
            c.incrementCount();
            
            try{
                TimeUnit.MILLISECONDS.sleep(1000);
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("");
    }
    
    
    public static int getAnimalCount(){
        //Original
        //return (int) (Math.random() * 5) + 1;
        
        //Controlled
        int count = Console.getInt("Please Enter the amount that you want to count: ");
        return count;
        
    }
    
}
        
    
    
