import java.util.Scanner;
class Main
{
   public static void main(String args[])
   {
     Scanner in = new Scanner(System.in);
     String text = in.nextLine();
     StringBuilder str = new StringBuilder(text); 
     int key = in.nextInt();
     int str_len = str.length();
     for(int index = 0; index <= str_len - 1; index++)
     {
       char ch = str.charAt(index);
       if(ch >= 'A' && ch <= 'Z')
       {
           int offset = ch - 'A';
           offset = (offset - key) % 26;
           if(offset < 0)
             offset = offset+26;
           ch = (char)(offset + 'A');
       }
       else if(ch >= 'a' && ch <= 'z')
       {
           int offset = ch - 'a';
           offset = (offset - key) % 26;
           if(offset < 0)
             offset = offset+26;
           ch = (char)(offset + 'a');
       }
       str.setCharAt(index,ch);
     }
     System.out.print(str);
   }
}