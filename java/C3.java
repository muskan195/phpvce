class A
{
A()
{
System.out.println("A");
}
}
class B extends A
{
}
class C3 extends B
{
C3()
{
System.out.println("C");
}
public static void main(String... a)
{
C3 e1=new C3();
}
}