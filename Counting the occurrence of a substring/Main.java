import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner sc = new Scanner(System.in);
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    int count = 0;
    for(int i = 0 ; i< str1.length(); i++)
    {
      boolean isMatching = false;
      if(str1.charAt(i) == str2.charAt(0))
      {
        for(int j = 1; j< str2.length() && i+j < str1.length(); j++)
        {
          if(str1.charAt(i+j) == str2.charAt(j))
            isMatching = true;
          if(!isMatching)
            break;
        }
        if(isMatching){
          count++;
          isMatching = false;
        }
      }
    }
    System.out.println(count);
  } 
}