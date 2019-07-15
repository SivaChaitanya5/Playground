import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in = new Scanner(System.in);
      int row = in.nextInt();
      int col = in.nextInt();
      for(int i = 0; i<row; i++)
      {
        for(int j = 0; j<col; j++)
        {
          if(j>=i)
          System.out.print(row-i);
          else
            System.out.print(row-j);
        }
        System.out.println();
      }
    }
}