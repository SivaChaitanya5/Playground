import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int count = 0;
    for(int i = 0; i<str.length(); i++)
      if(str.charAt(i) == ' ')
        count++;
    String words[] = str.split(" ",count+1);
    for(int i = 0; i<count+1; i++)
    {
      if( i!=0 )
        System.out.print(" ");
      reverse(words[i]);
    }
    
  }
  public static void reverse(String word)
  {
    int len = word.length();
    for(int i = len-1; i>=0; i--)
      System.out.print(word.charAt(i));
  }
}