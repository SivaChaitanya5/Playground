import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.List;
public class Main 
{
    static List<String> al = new ArrayList<String>();
    public static void main(String a[])throws IOException
    {
      //type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      //System.out.println("Choose any one:\n1.Insert\n2.delete\n3.Display\n4.Exit");
      int ch = 0;
      while(ch!= 4){
        System.out.println("Choose any one:\n1.Insert\n2.delete\n3.Display\n4.Exit");
        ch = Integer.parseInt(br.readLine());
        switch(ch){
          case 1:
            add(br.readLine());
            break;
          case 2:
            int index = Integer.parseInt(br.readLine());
            System.out.println("Enter the index value to be deleted:"+index);
            delete(index);
            break;
          case 3:
            System.out.println(al);
            break;
          case 4:
            break;
          default :
            System.out.println("Invalid Option");
            break;
        }
      }
      
    }
    public static void add(String s){
      String[] str = s.split(",");
      int i = 0;
      while(i < str.length){
        al.add(str[i]);
        i++;
      }
    }
    public static void delete(int i){
      al.remove(i);
    }
}