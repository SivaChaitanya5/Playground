import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      StringBuilder sb = new StringBuilder(str);
      StringBuilder temp = new StringBuilder("");
      for(int i = sb.length() - 1; i >= 0; i--)
        temp.append(sb.charAt(i));
      
      if(sb.toString().equals(temp.toString()))
        System.out.println("Yes");
      else
        System.out.println("No");
    } 
}