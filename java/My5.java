interface My5
{
void show();
}
class Child implements My5
{
public void show()
{
System.out.print("hello");
}
/*public String print()
{
return"hello";
}*/
public String toString()
{
return"hello";
}
public static void main(String args[])
{
My5 m=new Child();
System.out.print(m.toString());
//System.out.print(m.print());
}
}
