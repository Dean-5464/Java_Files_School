import java.text.NumberFormat;
public class Product
{
 private String name;
 private double price;
public Product(String n, double p)
{
 this.name = n;
 this.price = p;
}
public String getName()
{
 return name;
}
public void setName(String name)
{
this.name = name;
}
public double getPrice()
{
 return price;
}
public void setPrice(double price)
{
 this.price = price;
}
public String getSummaryLine()
{
 NumberFormat currency = NumberFormat.getCurrencyInstance();
 //return this.name + "\t\t" + currency.format(this.price);
 return currency.format(this.price) + "\t" + this.name;
}
}