 public class Circle extends Shape {
    
    private double radius;
    
    //constructor
    public Circle(double r) {
        radius = r;
    }
    
    //default
    public Circle() {
        radius = 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return (getRadius() * getRadius()) * Math.PI;
       //return radius * radius * Math.PI;
       //return Math.pow(radius, 2.0) * Math.PI;
    }
    
    @Override
    public String getShapeType()
    {
        return this.getClass().getName();
    }
}
