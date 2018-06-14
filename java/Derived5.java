class Base
{
Base show()
{
System.out.println("Base");
return this;
}
}
class Derived5 extends Base
{
Derived5 show()               //2nd rule of overriding
{                             //function name s overriding   
System.out.print("Derived5");
return this;
}
public static void main(String... a)
{
Derived5 d=new Derived5();
d.show();
}}