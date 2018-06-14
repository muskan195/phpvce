 class temp22
{
 
{
   System.out.print("welcome"); //            <-this is init block which execute first
 }


temp22()
 {
this(10);
  System.out.print("hello");
 }


temp22(int a)
 {
  this(10,20);
  System.out.print("hii");
 }


temp22(int a,int b)
 {
   System.out.print("bye");
  }


public static void main(String args[])
  {
   temp22 t1=new temp22();
  }


{
System.out.print("to our institute");           //   <-this is init block statement which execute after the execute first blok statemne above
}                                                
}