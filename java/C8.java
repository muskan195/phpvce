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
class C8 extends B
{
public static void main(String... a)
{
Object e1=new C8();
e1.show();
}
}