import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        print_spirally(a, n);
        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j < n; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void print_spirally(int a[][], int n)
    { 
        // r_min --> row_minimum, r_max --> row_maximum
        // c_min --> column_minimum, c_max -- > column_maximum
        int val = 1;
        int r_min = n-1, c_min = n-1;
        int r_max = 0, c_max = 0;
        while ((r_min >= r_max) && (c_min >= c_max))
        {
            // Traversing from Left to Right
            for(int i = c_min; (i >= c_max); i--)
            {
                a[r_min][i] = val++;
            }
            // Traversing from Top to Bottom
            for(int i = r_min - 1; (i >= r_max); i--)
            {
                a[i][c_max] = val++;
            }
            // Traversing from Right to Left
            for(int i = c_max+1; (i <= c_min); i++)
            {
                a[r_max][i] = val++;
            }
            // Traversing from Bottom to Top
            for(int i = r_max + 1; (i <= r_min-1); i++)
            {
                a[i][c_min] = val++;
            }
            // Updating the index values of row and column for the next spiral cycle
           r_min--; c_min--; r_max++; c_max++;
        }
    }
}