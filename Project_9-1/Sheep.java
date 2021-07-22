public class Sheep extends Animal
{
 
    private String name;
    
    public Sheep(String name){
        this.name = name;
    }
    
    public Sheep(){
        name = "Blackie";
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    @Override
    public String getCountString(){
        return count + " sheep " + name;
    }
}
