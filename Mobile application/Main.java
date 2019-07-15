class MyModel1 {
     //write your logic here
  int camera = 2, display = 5;
  String lock = "No lock";
  MyModel1(){
    System.out.println("Features of MyModel 1");
    System.out.println("Camera mega pixels: "+camera);
  }
}
class MyModel2 extends MyModel1 {
     //write your logic here
  int camera = 5;
  int display = super.display;
  String lock = "Fingerprint";
  MyModel2(){
    super();
    System.out.println("Features of MyModel 2");
    System.out.println("Camera mega pixels: "+camera);
    System.out.println("Lock mechanism: "+lock);
    System.out.println("Display size: "+display);
  }
}
class MyModel2T extends MyModel2 {
     //write your logic here
  int camera = 16, display = 6;
  String lock = super.lock;
  MyModel2T(){
    super();
    System.out.println("Features of MyModel 2T");
    System.out.println("Camera mega pixels: "+camera);
    System.out.println("Lock mechanism: "+lock);
    System.out.println("Display size: "+display);
  }
}
public class Main 
{
    public static void main(String[] args) 
    {
          //write your logic here
      MyModel2T m = new MyModel2T(); 
    }
}