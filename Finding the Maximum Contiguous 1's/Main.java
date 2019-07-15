import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner sc  = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      int count[] = new int[n];
      for(int i = 0; i<n; i++)
      {
        arr[i] = sc.nextInt();
        count[i] = 0;
      }
      int temp = 0;
      int high = 0;
      for(int i = 0 ; i<n; i++)
      {
        if(arr[i] == 1)
          count[temp]++;
        else
          temp++;
      }
      for(int i = 0; i<temp; i++)
      {
        if(count[i] > high)
          high = count[i];
      }
      System.out.println(high);
    }
}