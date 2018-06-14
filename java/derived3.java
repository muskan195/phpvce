class Base3
{                        //ist rule of overriding by function 
void show()
{
System.out.println("Base3");
}}                              // overridding fun.
class Derived3 extends Base3     // agr kisi class m koi 2 fun. psnd ni aye to we can replace the inherent class by overloading the fun   
{                                                                                          
void show()
{
System.out.println("Derived3");
}
public static void main(String args[])
{
Derived3 d=new Derived3();
d.show();
}}
