class A
{
void show()
{
System.out.println("A");
}
}
class B extends A
{
void show()
{
System.out.println("B");
}
}
class C6 extends B
{
void show()
{
System.out.println("C6");
}
public static void main(String... a)
{
A e1=new B();
e1.show();
}
}