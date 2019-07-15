import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n<0)
    {
      System.out.print("-");
      n = n*-1;
    }
    int temp = n;
    int count = 0;
    while(n > 0)
    {
      n = n/10;
      count++;
    }
    char sb[] = new char[count];
    for(int i = 0; i<count; i++ )
    {
      char ch = (char) (temp%10 +'0');
      sb[i] = ch;
      temp = temp/10;
    }
    for(int i = count-1; i>=0; i--)
      System.out.print(sb[i]);
  }
}