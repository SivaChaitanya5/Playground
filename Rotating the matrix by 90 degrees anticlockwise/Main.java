import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int coloumn = sc.nextInt();
    int matrix[][] = new int[row][coloumn];
    for(int i = 0; i<row; i++)
      for(int j = 0; j<coloumn; j++)
        matrix[i][j] = sc.nextInt();
    for(int i = row-1; i>=0; i--)
    {
      for(int j = 0; j<coloumn; j++)
        System.out.print(matrix[j][i]+" ");
      System.out.println();
    }
  }
}