class emp5
{
String name;
int salary;

void getvalue(String S1, int S2)
{
name=S1;
salary=S2;
}

void putvalue()
{
System.out.print(name);
System.out.print(salary);
}

public static void main(String args[])
{
emp e1=new emp();
e1.getvalue("lalu",21);

emp e2=new emp();
e2.getvalue("bhalu",22);

emp e3=e2;
e2=e1;
e1.putvalue();
e2.putvalue();
e3.putvalue();
}}