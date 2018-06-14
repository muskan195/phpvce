 class temp23
{
 
{
   System.out.print("welcome"); //            <-this is init block which execute first
 }


temp23()
 {
this(10);
  System.out.print("hello");
 }


temp23(int a)
 {
  this(10,20);
  System.out.print("hii");
 }


temp23(int a,int b)
 {
   System.out.print("bye");
  }


public static void main(String args[])
  {
   temp23 t1=new temp23();
  }
}
