class base2
{
int x=10;
}
class derived2 extends base2
{
int x=20;
void show()
{
System.out.println(x);
System.out.println(super.x);
//System.out.println(super);    --> gives error
}
public static void main(String args[])
{
derived2 e1=new derived2();
e1.show();
}}