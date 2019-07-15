import java.util.Scanner;
class Main{
  public static int Sum(int n,int res)
  {
    res = res+n;
    return res;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int res=0;
      for(int i=1; i<=n; i++)
      {
        res = Sum(i,res);
      }
      System.out.println(res);
	}
}