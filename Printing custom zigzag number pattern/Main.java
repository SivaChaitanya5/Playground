import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int count=1;
      for(int i=1; i<=n; i++)
      {
        if(i%2==1)
        {
           for(int j=1; j<=n-1; j++)
            {
               System.out.print(count);
            }
          count= count+1;
          System.out.print(count);
          count= count+1;
        }
        else
        {
          System.out.print(count);
          count=count-1;
          for(int k=2; k<=n;k++)
            System.out.print(count);
          count = count+1;
        }
        System.out.println();
      }
	}
}