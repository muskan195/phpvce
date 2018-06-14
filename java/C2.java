class A
{
A()
{
System.out.println("A");
}
A(int a)
{
System.out.print("A" +a);
}
}
class B extends A
{
B()
{
super(10);
System.out.println("B");
}
B(int a)
{
super(a);
System.out.println("B" +a);
}
}
class C2 extends B
{
C2()
{
System.out.println("C");
}

C2(int a)
{
//super(a);
System.out.println("C" +a);
}
public static void main(String... a)
{
C2 e1=new C2(10);
}
}