import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exp = in.nextInt();
      int ans = 1;
      while(exp > 0)
      {
        ans *= base;
        exp--;
      }
      System.out.println(ans);
    }
}