class  Outer5
{
static int x=10;
int y=20;
        class Inner
       {
   int y=30;
      void show()
      {
          System.out.print(x);
           System.out.print(this.y);  //--1030 q ki this phle apni class m chk krta h value
          // System.out.print(Outer5.this.y); //--1020
       }
        }
public static void main(String... a)
{
Outer5 o=new Outer5();
o.new Inner().show();
}
}
