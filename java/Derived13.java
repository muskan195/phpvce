abstract  class Base
{
int x,y;
void show()
{
System.out.println(x);
System.out.println(y);
}
}
class Derived13 extends Base
{
void get(int a,int b)
{
x=a;
y=b;
}
public static void main(String... a)
{
Derived13 d=new Derived13();  //o/p-- 1020
d.get(10,20);
d.show();
}
} 