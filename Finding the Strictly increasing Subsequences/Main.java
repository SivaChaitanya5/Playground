import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0; i<n; i++)
      arr[i] = sc.nextInt();
    for(int j = 0; j<n; j++)
    {
      for(int i = j+1; i<n; i++)
      {
        if(arr[j] < arr[i] && arr[i-1] < arr[i])
          System.out.println(arr[j]+","+arr[i]);
      }
    }
  }
}