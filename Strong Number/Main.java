import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int lastDigit,product=1,sum=0,temp=n;
      for(int i=1; n>0; i++)
      {
        lastDigit = n%10;
        for(int j=1; j<=lastDigit; j++)
        {
          product = product*j;
        }
        sum = sum + product;
        product = 1;
        n = n/10;
      }
      if(sum==temp)
         System.out.println("Yes");
      else
        System.out.println("No");
	}
}