import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int coloumn = sc.nextInt();
    int matrix1[][] = new int[row][coloumn];
    int matrix2[][] = new int[row][coloumn];
    int check = 1;
    for(int i = 0; i<row; i++)
      for(int j = 0; j<coloumn; j++)
        matrix1[i][j] = sc.nextInt();
    for(int i = 0; i<row; i++)
      for(int j = 0; j<coloumn; j++)
        matrix2[i][j] = sc.nextInt();
    for(int i = 0; i<row; i++)
    {
      for(int j = 0; j<coloumn; j++)
        if(matrix1[i][j] != matrix2[i][j])
        {
          check = 0;
          break;
        }
    }
    if(check == 1)
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}