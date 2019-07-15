import java.util.Scanner;
import java.lang.Math;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int temp = n ,count=0,lastDigit;
      double sum=0;
      while(temp>0)
      {
        count = count+1;
        temp = temp/10;
      }
      temp=n;
      for(int i=1; i<=count; i++)
      {
        lastDigit = temp%10;
        sum = sum + Math.pow(lastDigit,count);
        temp = temp/10;
      }
      if(sum==n)
        System.out.println("Armstrong Number");
      else
        System.out.println("Not a Armstrong Number");
	}
}