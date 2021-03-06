
/**
 * Abstract class Animal - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Animal implements Countable
{
    
    protected int count;
    
    public Animal(){
        count = 1;
    }
    
    @Override
    public void incrementCount(){
        count++;
    }
    
    @Override
    public void resetCount(){
        
    }
    
    @Override
    public int getCount(){
        return count;
    }
    
    @Override
    public String getCountString(){
        return count + "animal";
    }
}
