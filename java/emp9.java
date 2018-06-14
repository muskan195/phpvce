class emp9
{
String name;
int salary;
static String CName = "Tcs";

void getvalue(String S1, int S2)
{
name=S1;
salary=S2;
}

void putvalue()
{
System.out.print(name);
System.out.print(salary);
System.out.print(CName);
}

static void Cchange(String S3)
{
CName=S3;
}

public static void main(String args[])
{
emp9 e1=new emp9();
  e1.getvalue("lalu",21);
emp9 e2=new emp9();
   e2.getvalue("bhalu",22);
e1.putvalue();
e2.putvalue();
emp9.Cchange("wipro");
e1.putvalue();
e2.putvalue();
}}