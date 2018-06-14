class Outer
{
static int x=10;
int y=20;
    static class Inner
     {
       void show()
         {
     System.out.println(x);
  // System.out.println(y);
        }
    }
public static void main(String args[])
{
Inner i=new Inner();
i.show();
//show();  --> error
//Inner.show();  //agr inner.show ko chlana h to void show ko static bnyenge r call inner s krenge
}
}