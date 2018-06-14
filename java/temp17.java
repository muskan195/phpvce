class temp17
{
int x=10;
void show(int y,temp17 t)
{
int x=20;
System.out.print(x);
System.out.print(y);
System.out.print(t.x);
}
public static void main(String args[])
{
temp17 t1=new temp17();
t1.show(20,t1);
}}

