 import java.util.Scanner;

public class AreaCalculator 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to the Area Calculator\n");
        
        String choice = "y";
        while(choice.equalsIgnoreCase("y")) 
        {
            
            System.out.println("c - Circle \ns- Square \nr - Rectangle");
            System.out.println("Pick a shape to calculate area");
            String type = sc.next();
            
            System.out.println("");
            
            Shape shape;
            if(type.equalsIgnoreCase("c"))
            {
                System.out.print("Enter Radius: ");
                double radius = sc.nextDouble();
                shape = new Circle(radius);
                displayShape(shape);
            }
            else if (type.equalsIgnoreCase("s")) 
            {
                //Square
                System.out.print("Enter Width: ");
                double width = sc.nextDouble();
                shape = new Square(width);
                displayShape(shape);
            }
            else 
            {
                //Rectangle
                System.out.print("Enter Width: ");
                double width = sc.nextDouble();
                System.out.print("Enter Height: ");
                double height = sc.nextDouble();
                
                shape = new Rectangle(width, height);
                displayShape(shape);
            }  
            
            System.out.println("");
            System.out.println("Continue (y/n): ");
            choice = sc.next();
            System.out.println("");  
        }  
    }
    
    public static void displayShape(Shape c)
    {
            //display
            System.out.println("");
            System.out.println("The area of the " + c.getShapeType() +
                    " you entered is " + c.getArea());
            

    }
}
