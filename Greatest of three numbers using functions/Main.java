import java.util.Scanner;
class Main{
  public static int Greatest(int n1, int n2)
  {
    if(n1>n2)
      return n1;
    else
      return n2;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int res;
      int n1= in.nextInt();
      int n2= in.nextInt();
      int n3= in.nextInt();
      res= Greatest(n1,n2);
      res= Greatest(res,n3);
      System.out.println(res);
	}
}