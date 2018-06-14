interface my
{
void show();
}
class Outer9
{
static int x=10;
int y=20;
public static void main(String... a)
{
my m=new my()
   {
    public void show()
     {
     System.out.print(x);
    // System.out.print(y);
     }
   };
 m.show();
}
}
