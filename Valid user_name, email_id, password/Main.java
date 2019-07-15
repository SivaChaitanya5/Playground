import java.util.regex.Matcher;
import java.util.regex.*;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
    // type your code here
  public static void main(String a[]) throws IOException{
      // type your code here
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String userName = br.readLine();
    String email = br.readLine();
    String pwd = br.readLine();
    System.out.println("Is "+userName+" a valid user name? "+Pattern.matches("^[0-9A-za-z_-]*$" , userName));
    System.out.println("Is "+email+" a valid email address? "+Pattern.matches("^[0-9a-z_@.]*$" , email));
    System.out.println("Is "+pwd+" a valid password? "+Pattern.matches("^[0-9A-za-z_[-][@#$%]]*$" , pwd));
    }
}