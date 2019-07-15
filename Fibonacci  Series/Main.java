import java.util.*;
class Fibonacci extends Thread
{
  // type your code here
  int n;
  int i = 0;
  int j = 1;
  Fibonacci(int inp){
  	this.n = inp;
  }
  public void run(){
  	try{
    	Thread.sleep(0);
        System.out.print("The Fibonacci series is :"+i+" "+j+" ");
        for(int k = 2; k<n; k++){
        	System.out.print(i+j+" ");
            int temp = i;
            i = j;
            j = temp+j;
         }
    }
    catch(Exception e){
    	System.out.println("Exception occurred");
        }
  }
}
class Main
{
     public static void main(String[] args) 
     {
        // type your code here
       Scanner in = new Scanner(System.in);
       System.out.print("Enter the limit for Fibonacci: ");
       int n = in.nextInt();
       System.out.println(n);
       Fibonacci t1 = new Fibonacci(n);
       //Thread t1 = new Thread(f);
       if( n < 2){
       t1.start();
       t1.interrupt();
       }else
         t1.start();
     }
}