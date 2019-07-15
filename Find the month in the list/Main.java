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
      String[] mon = s.split(",");
      int i = 0;
      List<String> months = new ArrayList<String>();
      while(i < mon.length){
      	months.add(mon[i]);
        i++;
      }
      String check = br.readLine();
      System.out.println(months);
      System.out.println("Size of the linked list: "+i);
      System.out.println("Is LinkedList empty? "+months.isEmpty());
      System.out.println("Does LinkedList contains "+check+"?");
      System.out.println(months.contains(check));
    }
}