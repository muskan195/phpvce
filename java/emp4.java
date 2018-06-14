class emp4
{
String name;
int salary;

void getvalue(String S1,int S2)
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
emp4 e1=new emp4();
e1.getvalue("lalu",21);

emp4 e2;
e2.getvalue("bhalu",22);

e1.putvalue();
e2.putvalue();

}
}