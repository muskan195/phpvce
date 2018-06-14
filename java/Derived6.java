class Base  // specifier ko chng krke overloading
{     
protected void show() // yha protected ek specifier weak
{
System.out.println("Base");
}                            //always allow weak to stronger
}
class Derived6 extends Base
{
public void show()      // yha public specifier h strong
{
System.out.println("Derived6");
}
public static void main(String... a)
{
Derived6 e1=new Derived6();
e1.show();
}
}

