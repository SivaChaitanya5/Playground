import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[] = new int[n];
      for(int i = 0; i < n; i++)
        arr[i] = sc.nextInt();
      int check = 1;
      for(int i = 0; i < n/2; i++)
        if(arr[i] != arr[n-i-1])
        {
          check = 0;
          break;
        }
      if(check == 1)
        System.out.println("Yes");
      else
        System.out.println("No");
    }
}