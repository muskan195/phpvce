class emp14
{
int salary;
emp14()                 // counstructer
{
salary=20000;
}
public static void main(String args[])
{
emp14 e1=new emp14();
emp14 e2=new emp14();
e1.show();
e2.show();
}
void show()
{
System.out.print(salary);
}}