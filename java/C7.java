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
class C7 extends B
{
public static void main(String... a)
{
A e1=new C7();
e1.show();
}
}