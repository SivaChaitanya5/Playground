import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i<n; i++)
        arr[i] = sc.nextInt();
      int temp[] = new int[n];
      for(int i = 0; i<n; i++)
        temp[i] = 0;
      for(int i = 0; i<n; i++)
        temp[arr[i]-1]++;
      for(int i = 0; i<n; i++)
        if(temp[i] == 0)
          System.out.println(i+1);
    }
}