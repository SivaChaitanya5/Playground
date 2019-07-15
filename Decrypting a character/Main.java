import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in = new Scanner(System.in);
      char ch = in.next().charAt(0);
      int key = in.nextInt();
      
      if(ch >= 'a' && ch <= 'z'){
      int offset = ch - 'z';
      offset = (offset - key ) % 26;
      ch = (char)(offset + 'z');
    }
    else if(ch >= 'A' && ch <= 'Z'){
      int offset = ch - 'Z';
      offset = (offset - key) % 26;
      ch = (char)(offset + 'Z');
    }
    System.out.print(ch);
    }
}