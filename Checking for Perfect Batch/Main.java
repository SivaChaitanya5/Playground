import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n; i++)
    {
      arr[i] = in.nextInt();
    }
    int count = n/3;
    int check[] = new int[count];
    int temp=0;
    for(int i = 0,j = 0; i<n; i=i+3,j++)
    {
      check[j] = arr[i]+arr[i+1]+arr[i+2];
    }
    for(int i=1; i<count; i++)
    {
      if(check[i-1] != check[i])
      {
        temp = 1;
        break;
      }
    }
    if(temp == 0)
      System.out.println("Perfect Batch");
    else
      System.out.println("Not a Perfect Batch");
  }
}