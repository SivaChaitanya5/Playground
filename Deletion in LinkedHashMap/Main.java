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
      LinkedHashMap<String, String> tm = new LinkedHashMap<String, String>();
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
      System.out.println("Size of map is : "+tm.size());
    }
}