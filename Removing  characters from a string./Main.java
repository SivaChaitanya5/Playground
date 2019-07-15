import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    int check = 0;
    for(int i = 0; i<str1.length(); i++)
    {
      for(int j = 0; j<str2.length(); j++)
      {
        if(str1.charAt(i) == str2.charAt(j))
        {
          check = 1;
          break;
        }
      }
      if(check == 0)
        System.out.print(str1.charAt(i));
      else
        check = 0;
    }
  }
}