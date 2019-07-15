import java.util.Scanner;
class Main 
{
  public static void seqArrange (int arr[], int oddArr[], int evenArr[], int n, int o, int e, int r)
  {
    for(int i = 0; i<n; i++)
    {
      if(i%2 == 0)
        oddArr[i/2] = arr[i];
      else
        evenArr[i/2] = arr[i];
    }
    for(int i = 0; i<r; i++)
    {
      int last;
      last = oddArr[o-1];
      for(int j = o-1; j>0; j--)
        oddArr[j] = oddArr[j-1];
      oddArr[0] = last;
    }
    
    for(int i = 0; i<r; i++)
    {
      int first;
      first = evenArr[0];
      for(int j = 1; j<=e-1; j++)
        evenArr[j-1] = evenArr[j];
      evenArr[e-1] = first;
    }
    
    for(int i = 0; i<n; i++)
    {
      if(i%2 == 0)
        System.out.print(oddArr[i/2]+" ");
      else
        System.out.print(evenArr[i/2]+" ");
    }
  }
  public static void main(String args[])
    {
    	//Try your code here
    	Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<n; i++)
    {
      arr[i] = in.nextInt();
    }
    int r = in.nextInt();
    if(n%2 == 0)
    {
      int oddArr[] = new int[n/2];
      int evenArr[] = new int[n/2];
      seqArrange(arr, oddArr, evenArr, n, n/2, n/2, r);
    }
    else
    {
      int o = n/2+1;
      int oddArr[] = new int[o];
      int evenArr[] = new int[n/2];
      seqArrange(arr, oddArr, evenArr, n, o, n/2, r);
    }
    
  	}
}