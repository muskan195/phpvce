interface My6
{
public String toString();
}
class Child implements My6
{
public void show()
{
System.out.print("hello java");
}
public String toString()
{
return"hii java";
}
/*public string print()
{
return"bye bye java";
}
*/
public static void main(String... a)
{
My6 m=new Child();
System.out.print(m.toString());
//System.out.print(m.print());
}
}