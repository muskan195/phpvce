abstract  class Base
{
int x,y;
void show()
{
System.out.println(x);
System.out.println(y);// error becase no get fun. in base class n also no abstract fun.
}
}
class Derived12 extends Base
{
void get(int a,int b)
{
x=a;
y=b;
}
public static void main(String... a)
{
Base b=new Derived12();
b.get(10,20);
b.show();
}
} 