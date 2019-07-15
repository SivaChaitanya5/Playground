import java.io.*;
import java.lang.*;
import java.util.*;
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
      while(i < str.length){
        ts.add(str[i]);
        i++;
      }
      System.out.println(ts);
      for(int j =ts.size(); j > 0 ; j--){
        ts.remove(ts.last());
        System.out.println(ts);
      }
    }
}