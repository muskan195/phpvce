class Dadaji
{
int x=50;
}
class Base extends Dadaji
{
int x=10;
}
class Derived4 extends Base
{
int x=20;
void show()
{
System.out.println(x);
System.out.println(super.x);
}
public static void main(String args[])
{
Derived4 d=new Derived4();
System.out.println(((Dadaji)d).x);  //2--> for print x=50
d.show();
}}