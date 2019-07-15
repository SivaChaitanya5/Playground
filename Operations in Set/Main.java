import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String s = br.readLine();
      Set<String> lhs = new LinkedHashSet<>();
      String[] str = s.split(",");
      int i = 0;
      while(i < str.length){
        lhs.add(str[i]);
        i++;
      }
      System.out.println(lhs);
      String r = br.readLine();
      System.out.println("Enter the value to be deleted: "+r);
      lhs.remove(r);
      System.out.println(lhs);
      String in = br.readLine();
      System.out.println("Enter the value to be added: "+in);
      lhs.add(in);
      System.out.println(lhs);
    }
}