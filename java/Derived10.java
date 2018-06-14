class Dadaji
{
}
class Base extends Dadaji
{
void show()
{
}
}
class Derived10 extends Base
{
void show()
{
}
public static void main(String... a)
{
Object o=new Derived10(); //object is also a parent class thats why 
//Dadaji d=new Derived10();//here Dadaji iseasily compile n run becse by rule  parent class is Object
//d.show();
}
}