import java.awt.Frame;
class Admin2
{
public void finalize()
{
System.out.println("sainik sahid");
}
static void show()
{
Admin2 e1=new Admin2();
e1.print();
display();
}
static void display()
{
Admin2 e2=new Admin2();
}
void print()
{
}
public static void main(String... a)
{
Admin2 e3=new Admin2();
Admin2 e4=new Admin2();
show();
/*e4=null;
System.gc();
Frame f1=new Frame();
f1.setvisible(true);*/

for(int i=1; i<=1000; i++)
{
try{Thread.sleep(1000);}
catch(Exception e){}
System.gc();
}
new Admin2();
{
}
}

} 
