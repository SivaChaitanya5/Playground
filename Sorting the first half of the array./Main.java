import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int i = 0; i<n; i++)
      list[i] = sc.nextInt();
    bubble_sort(n/2, n, list) ; 
  }
  public static void bubble_sort(int n, int size, int list[])
 {
   for(int i = 0; i <= n-2; i++)
   {
     for(int j = 0; j<= n-2-i; j++)
     {
       if(list[j] > list[j+1])
       {
         int temp = list[j];
         list[j] = list[j+1];
         list[j+1] = temp;
       }
     }
   }
   for(int i = 0; i < size; i++)
   System.out.print(list[i]+" ");
 }
}