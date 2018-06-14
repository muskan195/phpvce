class Temp32
 {
  int x=10;
  void show(int y)
  {
   int z=x/y;
   System.out.println(z);
  }
 public static void main(String args[])
 {
Temp32 t1=new Temp32();
System.out.println("Before");
//t1.show(5);                          //-Before 2 after
t1.show(0);
System.out.println("after");
}
}
