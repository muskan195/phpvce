interface my
{
void show();
}
class Outer7
{
static int x=10;
int y=20;
   my display()
   {
    return(new my()
     {
       public void show()
         {
          System.out.print(x);
          System.out.print(y);
           }
         });
       }
public static void main(String... a)
{
Outer7 o=new Outer7();
my i=o.display();
i.show();
}
}
       