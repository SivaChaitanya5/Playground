import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner in = new Scanner(System.in);
      int ch = in.nextInt();
      int a = 0,b = 0;
      switch(ch)
      {
        case 1:a = in.nextInt();
          System.out.println(a*a);
          break;
        case 2:a = in.nextInt();
          		b = in.nextInt();
          System.out.println(a*b);
          break;
        case 3: a = in.nextInt();
          		b = in.nextInt();
          System.out.println(0.5*a*b);
          break;
        case 4: a = in.nextInt();
          System.out.println(3.14*a*a);
          break;
      }
    }
}