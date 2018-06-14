class emp
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
  System.out.println(name);
  System.out.println(salary);
}
public static void main(String args[])
{
  emp e1=new emp();
  e1.getvalue("lalu",21);
  e1.putvalue();
}
}