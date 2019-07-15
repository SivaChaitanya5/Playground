import java.util.Scanner;
public class Main{
  public static int GCD(int n1, int n2)
  {
    int res=0;
    for(int i=1; i<=n1; i++)
    {
      if(n1%i==0 && n2%i == 0)
        res = i;
    }
    return res;
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int res=0;
      res = GCD(n1,n2);
      res= GCD(res,n3);
      System.out.println(res);
	}
}