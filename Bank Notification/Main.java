import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //write your logic here
      Details d = new Details();
      Scanner in = new Scanner(System.in);
      String bank = in.nextLine();
      int ch = in.nextInt();
      switch(ch){
        case 1:
          System.out.println(bank+"-"+d.notificationBySms());
          break;
        case 2:
          System.out.println(bank+"-"+d.notificationByEmail());
          break;
        case 3:
          System.out.println(bank+"-"+d.notificationByCourier());
          break;
        default :
          break;
      }
    }
}
interface Notification{
  public String notificationBySms();
  public String notificationByEmail();
  public String notificationByCourier();
}
class Details implements Notification{
  public String notificationBySms(){
    return "Notification by SMS";
  }
  public String notificationByEmail(){
    return "Notification by Mail";
  }
  public String notificationByCourier(){
    return "Notification by Courier";
  }
}