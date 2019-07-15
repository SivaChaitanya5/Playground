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
      TreeSet<String> ts = new TreeSet<String>();
      String[] str = s.split(",");
      int i = 0;
      System.out.println("Duplicate Entry is:");
      while(i < str.length){
        if(!ts.add(str[i])){
          System.out.println(str[i]);
        }
        i++;
      }
      System.out.println("TreeSet is : "+ts);
    }
}