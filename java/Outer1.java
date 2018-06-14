class Outer1
{
static int x=10; 
int y=20;
    static class Inner1
     {
       static void show()
        {
          System.out.print(x);
        }
public static void main(String args[])
     {
        System.out.print("Inner");
     }
}
public static void main(String args[])
{
Inner1.show();
}
}