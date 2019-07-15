public class Main {
	public static void main(String[] args) {
		//write the logic for the main function
      Customers c1 = new Customers(1001,"Saakshi","9000000000","Bangalore","16-Jul-1990",'F',"Lakme kajal, Salwar");
      Customers c2 = new Customers(1008,"Rahul","9000000001","Chennai","27-Jan-1992",'M',"T-Shirt, Jeans");
      Suppliers s1 = new Suppliers(7901,"ABC Traders","8000000000","Mumbai",10,"Paid",4.75f);
      Suppliers s2 = new Suppliers(7972,"XYZ Enterprises","8000000900","Kolkata",7,"Unpaid",4.35f);
      c1.displayProfileDetails();
      c2.displayProfileDetails();
      s1.displayProfileDetails();
      s2.displayProfileDetails();
      c1.editAddress(c1 , "Coimbatore");
      s1.editAddress(s1, "Delhi");
	  c1.placeOrder();
      s1.increaseStockLevel(5);
      s2.increaseStockLevel(10);
      
    }	
}

class Users {
		//write the logic for the class Users	    
  int id,itemsStock;
  String name,billingAddress,shippingAddress,dateOfBirth,paymentStatus,orderHistory;
  String mobileNumber;
  char gender;
  float feedbackRating;
  public Users(int id, String name, String mobileNumber,String shippingAddress, String dateOfBirth, char gender, String orderHistory){
    this.id = id;
    this.name = name;
    this.mobileNumber = mobileNumber;
    this.shippingAddress = shippingAddress;
    this.dateOfBirth = dateOfBirth;
    this.gender = gender;
    this.orderHistory = orderHistory;
  }
  public Users(int id, String name, String mobileNumber,String billingAddress, int itemsStock, String paymentStatus, float feedbackRating){
    this.id = id;
    this.name = name;
    this.mobileNumber = mobileNumber;
    this.billingAddress = billingAddress;
    this.itemsStock = itemsStock;
    this.paymentStatus = paymentStatus;
    this.feedbackRating = feedbackRating;
  }
  public void editAddress(Users obj, String location){
    if(obj instanceof Customers){
       System.out.println(obj.name+", "+obj.shippingAddress);
       obj.shippingAddress = location;
       System.out.println(obj.name+", "+obj.shippingAddress);
    }
    else{
      System.out.println(obj.name+", "+obj.billingAddress);
      obj.billingAddress = location;
      System.out.println(obj.name+", "+obj.billingAddress);
    }
  }
  public void displayProfileDetails(){
    System.out.println(name+", "+mobileNumber);
  }
}

class Customers extends Users{
		//write the logic for the class Customers	
  public Customers(int id, String name, String mobileNumber,String shippingAddress, String dateOfBirth, char gender, String orderHistory){
    super(id, name, mobileNumber, shippingAddress, dateOfBirth, gender, orderHistory);
  }
  public void placeOrder(){
    System.out.println("Order placed successfully!");
  }
}

class Suppliers extends Users {
		//write the logic for the class Suppliers
  public Suppliers(int id, String name, String mobileNumber,String billingAddress, int itemsStock, String paymentStatus, float feedbackRating){
    super(id, name, mobileNumber, billingAddress, itemsStock, paymentStatus, feedbackRating);
  }
  public void  increaseStockLevel(int stock){
    itemsStock = itemsStock + stock;
    System.out.println(name+", "+itemsStock);
  }
}