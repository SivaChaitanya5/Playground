import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
       // type your code here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String inp = br.readLine();
      String inp1 = br.readLine();
	  int i = 1;
      Pattern p = Pattern.compile(inp);   
    Matcher m = p.matcher(inp1);
    while (m.find()){
      System.out.println("found: "+i+" : "+m.start()+" - "+ m.end());
      i++;
    }
      if(i!= 1)
        System.out.println(i-1);
      else
        System.out.println("The given word is not present in the string");
    }
}