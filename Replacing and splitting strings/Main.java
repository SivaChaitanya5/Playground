import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      //Try your code here
      Scanner in = new Scanner(System.in);
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      int num = in.nextInt();
      str1 = str2;
      String[] words=str1.split("\\s");
	  for(String w:words){  
		System.out.println(w);  
	  }  
    }
}