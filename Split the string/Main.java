import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main{
    public static void main(String args[]){
          // type your code here
      Scanner in = new Scanner(System.in);
      String inp = in.nextLine();
      Pattern p = Pattern.compile("(and|or|,| )");
      String[] s = p.split(inp);
      for(int i = 0; i<s.length; i++)
        System.out.println(s[i]);
    }
}