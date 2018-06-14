class emp7
{
String name;
int salary;
static String Cname="wipro";

void getvalue(String S1,int S2)
{
name=S1;
salary=S2;
}

void putvalue()
{
System.out.println(name);
System.out.println(salary);
System.out.println(Cname);
}

public static void main(String args[])
{
emp7 e1=new emp7();
e1.getvalue("lalu",21);

emp7 e2=new emp7();
e2.getvalue("bhalu",22);
e1.putvalue();
e2.putvalue();
}
}
