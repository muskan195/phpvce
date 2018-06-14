class emp15
{
int salary=20000;
emp15()
{
salary=20000;
}
emp15(int sal)
{
salary=sal;
}
void show()
{
System.out.print(salary);
}
public static void main(String args[])
{
emp15 e1=new emp15(50000);
emp15 e2=new emp15(25000);
emp15 e3=new emp15();
e1.show();
e2.show();
e3.show();
}}