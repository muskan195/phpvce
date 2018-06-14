class Temp36
{
 int x=10;
 void show(int y)
 {
  try
  {
  int z=x/y;
                try
                {
             //   int a[]=new int[z];
               // int a[y]=x;
                }
               
                catch(ArrayIndexOutOfBoundsException e)
                {
                System.out.println("dont go towards");
                 } 
}          
catch(ArithmeticException e)
 {
  System.out.println("ypp got it");
  }
 }

public static void main(String... a)
{
Temp36 t1=new Temp36();
System.out.println("before");
t1.show(0);
System.out.println("after");
}

}


8int show()
 {
  try
   {
   System.exit(0);
    return 10;
   }
finally
{
 return 15;
}
}
 public static void main(String... a)
{
 Temp36 t1=new Temp36();
t1.show();

}
}*/
