interface my
{
void show();
}
class Outer6
{
static int x=10;
int y=20;
   my display()
   {
     class Inner implements my
     {
       public void show()
       {
         System.out.print(x);
         System.out.print(y);
        }
     }
    Inner i=new Inner();
    return i;
    }
  public static void main(String... a)
{
Outer6 o=new Outer6();
my i=o.display();
i.show();
}
}       
   

