class Base
{                 //4th rule...overriding achieve by static method

static void show()
{
System.out.println("Base");
}
}
class Derived7 extends Base
{
static void show()
{
System.out.println("Derived");
}
public static void main(String args[])
{
Derived7 d=new Derived7();
d.show();
}
}