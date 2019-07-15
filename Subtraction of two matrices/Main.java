import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int coloumn = sc.nextInt();
    int matrix1[][] = new int[row][coloumn];
    int matrix2[][] = new int[row][coloumn];
    for(int i = 0; i<row; i++)
      for(int j = 0; j<coloumn; j++)
        matrix1[i][j] = sc.nextInt();
    for(int i = 0; i<row; i++)
      for(int j = 0; j<coloumn; j++)
        matrix2[i][j] = sc.nextInt();
    for(int i = 0; i<row; i++)
    {
      for(int j = 0; j<coloumn; j++)
        System.out.print(matrix1[i][j]-matrix2[i][j] +" ");
      System.out.println();
    }
  }
}