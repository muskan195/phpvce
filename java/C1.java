class A
{
A(int a)
{
//super(a);
System.out.println("A" +a);
}
}
class B extends A
{
B(int a)
{
super(a);
System.out.println("B" +a);
}
}
class C1 extends B
{
C1(int a)
{
super(a);
System.out.println("C" +a);
}
public static void main(String... a)
{
C1 e1=new C1(10);
}
}