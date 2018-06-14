class Outer4
{
static int x=10;
int y=20;
    void display()
    {
      class Inner1
      {
        void show()
        {
         System.out.print(x);
        System.out.print(y);
        }
      }
Inner1 i=new Inner1();
i.show();
}
public static void main(String... a)
{
Outer4 o=new Outer4();
o.display();
}
}
