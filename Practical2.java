class Product{
  int ProductId;
  String ProductName;
  double price;
  //Define instance variables:productId(int),productName(String),price(double)
  static int count ;
  Product()
  {
    ProductName=null;

  }
  Product(int productId,String productName,double price)
  {
    this.ProductId=productId;
    this.ProductName=productName;
    this.price=price;
    count++;

  }
  //Static variable for product count
  //constructor to initialize product attributes
  double discount(double price,double Discount)
  {
    return((100-Discount)/100)*price;

  }
  //Calculate and return the discounted prince 
  void displayProductInfo()
  {
    System.out.println("Product Id:"+ProductId);
    System.out.println("Product Name:"+ProductName);
    System.out.println("Product Price:"+price);
    //Display product information
    //Static method to retrieve total product count
  }
}
public class Practical2
{
  public static void main(String[] args)
  {
    Product product1=new Product(101,"Laptop",999.99);
    Product product2=new Product(202,"Smart Phone",499.95);
    Product product3=new Product(303,"Tablet",299.50);
    Product calcDiscount=new Product();

    product1.displayProductInfo();
    product2.displayProductInfo();
    product3.displayProductInfo();

    double DiscountedPrice=calcDiscount.discount(product1.price,10);
    System.out.println("Discounted Price :"+DiscountedPrice);
    System.out.println(Product.count);
  }  
}

