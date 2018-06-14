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
class C5 extends B
{
void show()
{
System.out.println("C5");
}
public static void main(String... a)
{
A e1=new C5();
e1.show();
}
}

