import java.util.concurrent.TimeUnit;

public class Kne_CountCars {

    
    public static void main(String[] args) {
        
        countHonda();
        countFord();
        
    } 
    
    public static void countFord() {
        System.out.println("Counting Ford ....");
        
        //create Ford object
        Ford ford = new Ford();
        
        //use count method
        count(ford, getCarCount());
    }
    
    public static void countHonda() {
        System.out.println("Counting Honda ....");
        
        Honda accord = new Honda("Accord");
        count(accord, 2);
        
        Honda civic = new Honda();
        civic.setModel("Civic");
        count(civic, 3);
        
        Honda crv = new Honda();
        count(crv, 2);
    }
    
    public static void count(Countable c, int maxCount) {
        c.resetCount();
        while(c.getCount() <= maxCount) {
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
    
    public static int getCarCount()
    {
        return (int) (Math.random() * 5) + 1;
    }
}
