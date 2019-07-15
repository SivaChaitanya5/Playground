import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String str[] = new String[n+1];
    for(int i = 0; i<n+1; i++)
      str[i] = sc.nextLine();
    for(int i = 0; i<n+1; i++)
    {
      str[i] = str[i].toLowerCase();
    }
    //System.out.println(str[3]);
    for (int i = 1; i < n+1; i++) 
        {
            for (int j = i + 1; j < n+1; j++) 
            {
                if (str[i].compareTo(str[j])>0) 
                {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        for (int i = 1; i <= n; i++) 
        {
            System.out.println(str[i]);
        }
  }
  
}