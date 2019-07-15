import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      int a=-1,b=-1;
      for(int i=0; i<= n-1; i++)
      {
        arr[i] = in.nextInt();
      }
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      for(int i=0; i<n; i++)
      {
        if(n1 == arr[i])
          a = i;
        if(n2 == arr[i])
          b = i;
      }
      System.out.println(a);
      System.out.println(b);
    }
}