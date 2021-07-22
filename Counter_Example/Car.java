
 


public class Car implements Countable {
    
    protected int count;
    
    public Car() {
        count = 1;
    }

    @Override
    public void incrementCount() {
        count++;
    }

    @Override
    public void resetCount() {
        
    }  

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public String getCountString() {
        return count + " car";
    }
    
    
}
