class outer2
{
static int x=10;
int y=20;
static class Inner2
{
static void show()
{
System.out.print(x);
//System.out.print(y);
}
public static void main(String... a)
{
System.out.print("Inner");
}
}
}
class jio extends outer2.Inner2
{
public static void main(String... a)
{
show();
}
}


