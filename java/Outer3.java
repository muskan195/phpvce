class Outer3
{
static int x=10;
int y=20;
        class Inner
       {
   int y=30;
      void show()
      {
          System.out.print(x);
           System.out.print(y);
       }
        }
public static void main(String... a)
{
Outer3 o=new Outer3();
o.new Inner().show();
}
}


 