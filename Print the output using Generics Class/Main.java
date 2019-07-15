import java.util.*;
import java.io.*;
public class Main<T> 
{ 
  // type your code here
  public T t;
  Main(T t){
    this.t = t;
   }
  public static void main(String[] args) throws IOException
     { 
       // type your code here
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       Main<Integer> m1 = new Main<Integer>(Integer.parseInt(br.readLine()));
       Main<String> m2 = new Main<String>(br.readLine());
       Main<Float> m3 = new Main<Float>(Float.parseFloat(br.readLine()));
       System.out.println("Integer Value: "+m1.t);
       System.out.println("String Value: "+m2.t);
       System.out.println("Float value: "+m3.t);
     }
 }