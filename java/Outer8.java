interface my
{
void show();
}
class Outer8
{
static int x=10;
int y=20;
   my m=new my()
   {
    public void show()
    {
     System.out.print(x);
     System.out.print(y);
   } };

  public static void main(String... a)
 {
  Outer8 o=new Outer8();
  o.m.show();
}
}
 
