
/**
 * An Extension of the Abstract Shape class that defines the object as a "square" by changing it's numeric values and formulas
 *
 * Dean Kammerer
 * 9/21/2020
 */
public class Square extends Shape {
 
    private double width;
    
    //constuctor method(s)
    
    //Default
    public Square(){
    }
    
    public Square(double w){
        width = w;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setWidth(double w){
        width = w;
    }
    
    @Override
    public double getArea(){
        //Area formula (Length * width = Area, and Length must be equal to width)
        return Math.pow(width, 2);
    }
    
    @Override
    public String getShapeType(){
        return this.getClass().getName();
    }
}
