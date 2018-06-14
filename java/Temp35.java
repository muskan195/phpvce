class Temp35
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
    System.out.print("dont enter into o");
   }
 
try
{
 /*int a[]=new int[z];
  int a[y]=x;*/
}
 
catch(ArrayIndexOutOfBoundsException e)
{
 System.out.print("dont cross limit");
 }
}

public static void main(String... a)
{
Temp35 t1=new Temp35();
System.out.print("Before");
t1.show(5);
System.out.print("After");
}
}