import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int count = 0;
    for(int i = 0; i<str.length(); i++)
      if(str.charAt(i) == ' ')
        count++;
    String div[] = str.split(" ",count+1);
    for(int i = 1; i<count; i++)
    {
      for(int j = 0; j<i; j++)
      {
        if(div[i].equals(div[j]))
        {
          for(int k = i; k<count; k++)
          {
            div[k] = div[k+1];
          }
          count--;
        }
      }
    }
    for(int i = 0; i<=count; i++)
    System.out.print(div[i]+" ");
  }
}