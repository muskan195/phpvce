class Base
{
void show()
{
}
}
class Derived11 extends Base
{
void display(); //but here we use semi colon so error n dimand for body of display..
{               //but if we dont want to give body to display so we should use here**abstract**
}
void show()
{
}
public static void main(String... a)
{
Base b=new Derived11();
b.show();
//b.display();//error beacase it find display fun. in base class n there is no disply fun. in base class 
}
}