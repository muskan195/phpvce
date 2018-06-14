class Base     //5th rule of overriding by throws keyword
{
void show()throws Exception
{
System.out.println("Base");
}
}
class Derived8 extends Base
{
void show()
{
System.out.println("Derived");
}
public static void main(String... a)
{
Derived8 e1=new Derived8();
e1.show();
}} 