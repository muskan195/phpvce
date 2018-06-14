class Demo6
{
static int x=10;
static
{
Demo d=new Demo();
d.show();
}}
class Demo
{
void show()
{
System.out.println("hello");
}
}
class Temp27
{
public static void main(String... a)
{
System.out.println(Demo6.x);
}
}