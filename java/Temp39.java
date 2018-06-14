import java .io.*;
class SalaryException extends Exception
{
SalaryException(String s)
{
super(s);
}
}
class Temp39
{
 int sal;
 void show(int sal) throws IOException
 {
  if(sal<0)
  {
throw new IOException("Negatve Salary");
  }
 else
 {
 this.sal=sal;
 }
 }
 void print(int sal) throws IOException
 {
 show(sal);
 }

 void display(int sal) throws IOException
 {
 print(sal);
 }

public static void main(String... a)
{
 Temp39 t1=new Temp39();
 try
 {
 t1.display(-15);
 }

  catch(IOException e)
  {
   e.printStackTrace();
   }
 System.out.print("after");
  }
}