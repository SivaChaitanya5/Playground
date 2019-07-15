//import required packages here
import java.util.Scanner;
class Item
{
  private int price;
  //create various method to return attribute value(s)
  public void setPrice(int price){
    this.price = price;
  }
  public int getPrice(){
    return this.price;
  }
}
   
class Customer
{
  private String product;
  private int quantity;
  //create various method to return attribute value(s)
  public void setProduct(String product){
    this.product = product;
  }
  public void setQuantity(int quantity){
    this.quantity = quantity;
  }
  public int getQuantity(){
    return this.quantity;
  }
  public String getProduct(){
    return this.product;
  }
}

class Bill
{
  //implement your logic to calculate total price
  public int total(int price, int quantity){
    return price*quantity;
  }
}
class Main
{
  public static void main(String[] args)
  {
    Item i = new Item();
    Customer c = new Customer();
    Bill obj = new Bill();
    //write the logic here
    Scanner in = new Scanner(System.in);
    c.setProduct(in.nextLine());
    i.setPrice(in.nextInt());
    c.setQuantity(in.nextInt());
    System.out.println("Total Price is : "+obj.total(i.getPrice(),c.getQuantity()));
  }
}