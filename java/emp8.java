class emp8
{
static int count;
String name;
emp8()
{
count++;
}
void show()
{
System.out.print(count);
}

public static void main(String args[])
{
emp8 e1=new emp8();
emp8 e2=new emp8();
emp8 e3=new emp8();
e3.show();
}
}