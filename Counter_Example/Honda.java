
 

public class Honda extends Car {
    
    private String model;
    
    public Honda(String model) {
        this.model = model;
    }
    
    public Honda() {
         this.model = "Unknown";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    @Override
    public String getCountString() {
        return count + " Honda " + this.model;
    }
    
}
