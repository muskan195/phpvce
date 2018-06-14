class base
{
int x=10;
}
class derived1 extends base
{
int x=20;
void show()
{
System.out.println(x);
}
public static void main(String args[])
{
derived1 d=new derived1();
d.show();
}}
