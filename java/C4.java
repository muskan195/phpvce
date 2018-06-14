class A
{
A(int a)
{
this();
System.out.println("A" +a);
}
A()
{
System.out.print("A");
}
}
class B extends A
{
B()
{
this(10);
System.out.println("B");
}
B(int a)
{
super(a);
System.out.println("B" +a);
}
}
class C4 extends B
{
C4()
{
super();
System.out.println("C");
}
C4(int a)
{
this();
System.out.println("C" +a);
}
public static void main(String... a)
{
C4 e1=new C4(10);
}
}

