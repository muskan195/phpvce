class demo
{
int x=10;
static int y=20;
void print()
{
new emp13().show();
}
static void fun()
{
new demo().print();
}}

class emp13
{
int x=50;
static int y=60;
void show()
{
System.out.print(new emp13().x);
}
static void display()
{
//demo.y=20;
demo.fun();
}
public static void main(String args[])
{
display();
//emp13.x=10;                       // show error
}}