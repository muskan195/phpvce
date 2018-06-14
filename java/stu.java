class stu
{
int a,b,c,d;
stu(int a,int b,int c,int d)
{
this.a=a;
this.b=b;
this.c=c;
this.d=d;
}
public static void main(String args[])
{
stu t1=new stu(10,20,30,40);            //by this we can copy the counstructor
stu t2=new stu(20,30,50,60);
stu t3=new stu(t1);
stu t4=new stu(t2);
t1.show();
t2.show();
t3.show();
t4.show();
}
void show()
{
System.out.print(a);
System.out.print(b);
System.out.print(c);
System.out.print(d);
}
stu(stu t)
{
a=t.a;
b=t.b;
c=t.c;
d=t.d;

}}