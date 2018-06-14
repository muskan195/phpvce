abstract  class Base
{
int x,y;
void show()
{
System.out.println(x);
System.out.println(y);
}
abstract void display();
}
class Derived14 extends Base
{
void display()
{
System.out.println("hello java");
}
void get(int a,int b)
{
x=a;
y=b;
}
public static void main(String... a)
{
Derived14 d=new Derived14();
d.display();
d.get(10,20);
d.show();
}
} 