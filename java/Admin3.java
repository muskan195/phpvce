import java.awt.Frame;
class Admin3
{
static Admin3 e;
static void show()
{
Admin3 e1=new Admin3();
e1.print();
display();
}
static void display()
{
Admin3 e2=new Admin3();
}
void print()
{
}
public void finalize()
{
e=this;
}

public static void main(String... a)
{
Admin3 e3=new Admin3();
Admin3 e4=new Admin3();
show();
e4=null;

for(int i=1; i<=1000; i++)
{
try{Thread.sleep(1000);}
catch(Exception e){}
System.gc();
}
new Admin2();
{
}
}}