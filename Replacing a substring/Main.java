import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      String str1 = sc.nextLine();
      String str2 = sc.nextLine();
      str = str.replaceAll(str1,str2);
      System.out.println(str);
    }
}