import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n; i++)
      arr[i] = sc.nextInt();
    int freq = 1;
    int high = 1;
    int highIdx = 0;
    for(int i = n-1; i>0; i--)
    {
      for(int j = i-1; j>=0; j--)
        if(arr[i] == arr[j])
          freq++;
      if(freq > high)
      {
        high = freq;
        highIdx = i;
      }
      freq = 1;
    }
    
    System.out.println(arr[highIdx]);
  }
}