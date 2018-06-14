class Temp37
{
 int sal;
 void show(int sal)
 {
  if(sal<0)
  {
  //ArithmeticException e=new ArithmeticException("negative salary");
  //throw e;
  throw new ArithmeticException("negative salay");
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
 Temp37 t1=new Temp37();
 t1.display(-5000);
 }
 }
 