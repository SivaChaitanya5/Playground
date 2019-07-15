import java.util.*;
class Main
{
  public static int Result(int base, int res)
  {
    return base*res;
  }
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int exponent = in.nextInt();
    int res=1;
    for(int i=1; i<=exponent; i++)
    {
      res = Result(base,res);
    }
    System.out.println(res);
  }
}