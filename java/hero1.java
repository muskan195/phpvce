 class hero1
{
void show(int a, long l)
{
System.out.println("10");
}
void show(int a,int b) // use this show fun. to remove error
{
System.out.println("Sk");
}
void show(long l,int a)
{
}
public static void main(String args[])
{
hero1 t1=new hero1();
t1.show(10,10);
}
}
