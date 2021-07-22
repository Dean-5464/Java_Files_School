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
                //enter code for square
            }
            else 
            {
                //enter code for rectangle
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
