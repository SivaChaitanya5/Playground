//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(long baseSalary)
  {
    //write your Faculty class statements
    System.out.println("Base Salary: " +baseSalary);
  }
}
class CSE
{
  public void salary(long baseSalary)
  {
    //write your CSE class statements
    Faculty faculty = new Faculty();
    faculty.salary(baseSalary);
    System.out.println("CSE Faculty: " +(baseSalary+3000));
  }
}
class IT
{
  public void salary(long baseSalary)
  {
    //write your IT class statements
    CSE cse = new CSE();
    cse.salary(baseSalary);
    System.out.println("IT Faculty: " +(baseSalary+5000));
  }
}
class ECE
{
  public void salary(long baseSalary)
  {
    IT it = new IT();
    it.salary(baseSalary);
    System.out.println("ECE Faculty: " +(baseSalary+4500));
    //write your ECE class statements
  }
}

class Main
{
  public static void main(String[] args)
  {
    ECE obj = new ECE();
    //implement your required concept here
    Scanner in = new Scanner(System.in);
    long baseSalary = in.nextLong();
    obj.salary(baseSalary);
  }
}