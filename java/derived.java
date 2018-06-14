class base
{
int x,y;
void show()
{
System.out.println(x);
System.out.println(y);
}
}
class derived extends base
{
void get(int a,int b)
{                                                       
x=a;
y=b;
}
public static void main(String[] args)
{
derived d=new derived();
d.get(10,20);
d.show();
}
} 