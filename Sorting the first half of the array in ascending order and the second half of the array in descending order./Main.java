import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list1[] = new int[n/2];
    int o = n/2;
    if(n%2 == 1)
      o = n/2+1;
    int list2[] = new int[o];
    for(int i = 0; i<n/2; i++)
      list1[i] = sc.nextInt();
    for(int i = 0; i<n/2; i++)
      list2[i] = sc.nextInt();
    ascending_order(n/2, list1);
    descending_order(o, list2);
  }
  public static void ascending_order(int n, int list[])
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
   for(int i = 0; i < n; i++)
   System.out.print(list[i]+" ");
 }
  public static void descending_order(int n, int list[])
 {
   for(int i = 0; i <= n-2; i++)
   {
     for(int j = 0; j<= n-2-i; j++)
     {
       if(list[j] < list[j+1])
       {
         int temp = list[j];
         list[j] = list[j+1];
         list[j+1] = temp;
       }
     }
   }
   for(int i = 0; i < n; i++)
   System.out.print(list[i]+" ");
 }
}