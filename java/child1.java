interface sk extends sk1
  {
     void display();
     void show();
  }
interface  sk1           
{
void print();
void show();  //RULE3-->INTERFACE          //one interface can extend other interface
}

class child1 implements sk 
  {
   public void display()
    {
     System.out.print("arnav");
    }

    public void print()
    {
     System.out.println("muskan");
    }

   public void show()
   {
    System.out.print("hello java");
    }
 
   public static void main(String... a)
   {
     sk s=new child1();
   s.show();
   s.display();
   s.print();

     sk1 s1=new child1();
     s1.show();
     //s1.display();
     s1.print();
   }
 }
