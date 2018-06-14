class A   // there is no  define any any extend so compiler automaticaly make or assume extend object
{
     //super() --> here if we not writw super thn compiler automaticaly use super()
A()             // whuch means super with blank
{
System.out.println("A");
}
}
class B extends A
{
B()
{
System.out.println("B");
}
}
class C extends B
{
C()
{
System.out.println("C");
}
public static void main(String... a)
{
C e1=new C();
}
}
