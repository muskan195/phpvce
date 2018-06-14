class Outer2
{
static int x=10;
int y=20;
   static class Inner
    {
     void show()
      {
       System.out.print(x);
      }
   public static void main(String... a)
    {
    System.out.print("Inner");
    }}}
class Demo6 extends Outer2.Inner
{
public static void main(String... a)
{
new Demo6.show();
}}

