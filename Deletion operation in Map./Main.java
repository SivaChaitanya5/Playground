import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of values to be inserted in map:"+n);
      TreeMap<String, String> tm = new TreeMap<String, String>();
      for(int i =0; i< n; i++){
        String s = br.readLine();
        String b = br.readLine();
        tm.put(s,b);
      }
      System.out.println(tm);
      String r = br.readLine();
      System.out.println("Enter the index to be removed:"+r);
      tm.remove(r);
      System.out.println(tm);
      String key = br.readLine();
      System.out.println("Enter the index to insert:"+key);
      String value = br.readLine();
      System.out.println("Enter the value to be inserted:"+value);
      tm.put(key,value);
      System.out.println(tm);
    }
}