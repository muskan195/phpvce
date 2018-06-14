class Temp28
{
final int a=10;
//final int b;  //--> error
void show()
{
//a++;      // --> cannot assign a value to final variable a a++
System.out.print(a);
} 
public static void main(String... a)
{
Temp28 t1=new Temp28();
t1.show();
}
} 