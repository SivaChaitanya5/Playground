import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner sc  = new Scanner(System.in);
      String str = sc.nextLine();
      StringBuilder sb = new StringBuilder("");
      for(int i = str.length() -1; i>=0 ; i--)
      {
        if(str.charAt(i) == ' ')
        {
          reverse_string(sb,0,sb.length() -1);
          sb.setLength(0);
        }
        else
          sb.append(str.charAt(i));
      }
      System.out.print(str.charAt(0));
    }
    // Function to reverse a string
    public static void reverse_string(StringBuilder sb, int start_idx, int end_idx)
    {
        // Type your code here
      while(start_idx < end_idx)
      {
        char temp = sb.charAt(start_idx);
        sb.setCharAt(start_idx , sb.charAt(end_idx));
        sb.setCharAt(end_idx , temp);
        start_idx++;
        end_idx--;
      }
      System.out.print(sb+" ");
    }
}