class Base
{
void show()
  {
  }
}
class Derived9 extends Base 
{
 void show()
  {
  }
public static void main(String... a)
  {
  Base b=new Derived9();//here knws that we can use reference variable of parent class inplace of reference variable of child class
   b.show();
  }
}  