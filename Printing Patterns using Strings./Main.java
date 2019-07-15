import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    char str2[] = new char[str1.length()];
    int count = 0;
    for(int i = str1.length()/2; i<str1.length(); i++)
    {
      str2[count] = str1.charAt(i);
      count++;
    }
    for(int i = 0; i<str1.length()/2; i++)
    {
      str2[count] = str1.charAt(i);
      count++;
    }
    for(int i = 0; i<count; i++)
    {
      for(int j = i; j<count-1; j++)
        System.out.print(" ");
      for(int k = 0; k<=i; k++)
        System.out.print(str2[k]);
      System.out.println();
    }
  }
}