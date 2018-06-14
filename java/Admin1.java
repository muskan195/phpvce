class Admin1
{
public void finalize()
{
System.out.println("sainik sahid");
}
static void show()
{
Admin1 t1=new Admin1();
t1.print();
display();
}
static void display()
{
Admin1 t2=new Admin1();
}
void print()
{
}
public static void main(String... a)
{
Admin1 t3=new Admin1();
Admin1 t4=new Admin1();
show();
t4.finalize();
}
}
v