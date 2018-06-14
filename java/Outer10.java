/*interface my
{
void show();          // 1st method
}
class temp
{
void display(my m)
{
System.out.print("important code");
}
}
class Outer10
{
static int x=10;
int y=20;
public static void main(String... a)
{
temp t1=new temp();
t1.display(new my()
             {
               public void show()
                  {
                    System.out.print("hello");
              } 
           });
        }
     }

*/




interface my
{
void show();               //2nd method
}
class Temp
{
void display(my m)
{
System.out.print("important code");
}
}
class child implements my
{
public void show()
{
System.out.print("hello");
}
}
class Outer10
{
static int x=10;
int y=20;
public static void main(String... a)
{
Temp t1=new Temp();
t1.display(new child());
}
}