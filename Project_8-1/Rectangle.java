
/**
 * A child class of the Square Class.  Has a common ancestor of the abstract Shape class.
 * This class defines an object as a "Rectangle" by adding several methods and changing some of
 * the formulas for calculating its area.
 *
 * Dean Kammerer
 * 9/21/2020
 */
public class Rectangle extends Square
{
 
    private double width;
    private double height;
    
    //Constructor method(s)
    
    //Default
    public Rectangle(){
    }
    
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    
    public double getHeight(){
        return height;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    @Override
    public double getArea(){
        return width * height;
    }
    
    
    
}
