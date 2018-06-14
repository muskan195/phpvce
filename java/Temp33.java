class Temp33
{
 int x=10;
 void show(int y)
 {
  try
  {
 int z=x/y;
 System.out.println(z);
 }
catch(ArithmeticException e)
   {
   System.out.println("Exception is" +e);
  }
 }
public static void main(String args[])
 {
  Temp33 t1=new Temp33();
  System.out.println("Before");
 // t1.show(0);
 t1.show(5);
System.out.println("after");
}
}