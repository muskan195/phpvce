interface gaurav      
{
void show();  //     RULE 1-->INTERFACE                    //one class can impliment one interface only
}
class child implements gaurav
{ 
public void show()
{
System.out.println("hello");
}
public static void main(String... a)
{
gaurav g=new child();
g.show();
}
}