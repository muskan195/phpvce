interface My4
{
void show();
}
class Child implements My4
{
public void show()
{
System.out.print("hello");
}
public void display()
{
System.out.print("hii");
}
public static void main(String... a)
{
My4 m=new My4();
m.display();  //show error becase display is not exist ni my class
}
}