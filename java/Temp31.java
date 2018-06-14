interface my1
{
void show();
}
interface my
{
static class Inner
{
  static void show()
   {
     System.out.print("Inner");
    }
 }
my1 m1=new my1()
 {
   public void show()
  {
    System.out.print("anonymous");
   }
  };
}
class Temp31 implements my
{
  public static void main(String... a)
  {
   Inner.show();
    m1.show();
   }
}
