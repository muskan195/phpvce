interface sk   //  RULE 2--> INTERFACE
{
void show();
void display();
}

interface sk1     //one class can implimented more than one interface also
{
void print();
void show();
}
class child implements sk,sk1
{
public void display()
{
System.out.print("kunal");
}
public void print()
{
System.out.print("muskan");
}
public void show()
{
System.out.print("hello");
}
public static void main(String... a)
{
sk m=new child();
m.show();
m.display();
//m.print();

sk1 m1=new child();
m1.show();
//m1.display();
m1.print();
}
}
