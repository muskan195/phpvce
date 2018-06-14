interface mani2
{
void print(); //RULE 4-->INTERFACE  //one interface can extend more thn one interface also
}
interface mani1
{   
void show();
}
interface mani extends mani1,mani2  
{
void display();
void show();
}
class child2 implements mani
{
public void print()
{
 System.out.print("muskan");
}
public void show()
{
 System.out.print("kunal");
}
public void display()
{
 System.out.print("angel");
} 
public static void main(String... a)
{
mani m=new child2();
m.show();
m.display();
m.print();

mani1 m1=new child2();
m1.show();
//m1.display();
//m1.print();

mani2 m2=new child2();
//m2.show();
//m2.display();
m2.print();
}
}