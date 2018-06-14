class Temp34
{
int x=10;
void show(int y)
{
try
{
int z=x/y;
/*int a[]=new int[z];
int a[y]=x;*/
}

catch(ArithmeticException e)
{
System.out.println("Dont enter o");
}

catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Dont cross limit of array");
}
catch(Exception e)
{
}
}
public static void main(String args[])
{
Temp34 t1=new Temp34();
System.out.println("Before");
t1.show(5);
System.out.println("after");
}
}