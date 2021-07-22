import java.util.Scanner;
public class ProductUI
{
 public static void main(String[] args)
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("The Product Price application\n");

 // get the number of products to enter
 System.out.print("Number of Products: ");
 int productCount = sc.nextInt();
 System.out.println();

 // create the array
 Product[] products = new Product[productCount];

 // get the data for each product
 for (int i = 0; i < productCount; i++)
 {
 System.out.print("Product " + (i + 1) + ": ");
 String name = sc.next();
 System.out.print("Price " + (i + 1) + ": ");
 double price = sc.nextDouble();
 System.out.println();
 products[i] = new Product(name, price);
 }

 double totalPrice = 0;
 // print the array
 System.out.println("SUMMARY");
 for (Product p : products) {
 System.out.println(p.getSummaryLine());
 totalPrice += p.getPrice();
 }
 java.text.NumberFormat currency = java.text.NumberFormat.getCurrencyInstance();
 System.out.println("Total Price: \t " + currency.format(totalPrice));
 }
}
