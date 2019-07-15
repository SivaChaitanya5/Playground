import java.util.Scanner;
class Main {
    public static void main(String[] args) 
    {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      System.out.println(sum_natural(n));
    }
  public static int sum_natural(int n)
  {
    if(n<=0)
      return 0;
    else
      return(n+ sum_natural(n-1));
  }
}