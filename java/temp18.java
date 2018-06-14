class temp18
{
temp18()
{
this(5);
System.out.println("ist");
}
temp18(int a)
{
this(10,20);
System.out.println("2nd");
}
temp18(int a,int b)
{
System.out.println("3rd");
}
public static void main(String args[])
{
temp18 t1=new temp18();
}}