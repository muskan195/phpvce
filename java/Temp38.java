 class Temp38
{
 int sal;
 void show(int sal)
 {
  if(sal<0)
  {
  ArithmeticException e=new ArithmeticException("negative salary");
  throw e;
  }
 else
 {
 this.sal=sal;
 }
 }
 void print(int sal)
 {
 show(sal);
 }

 void display(int sal)
 {
 print(sal);
 }

public static void main(String... a)
{
 Temp38 t1=new Temp38();
 try
 {
 t1.display(-15);
 }

  catch(ArithmeticException e)
  {
   e.printStackTrace();
   }
 System.out.print("after");
  }
}