class SalaryException extends RuntimeException
{
SalaryException(String s)
{
super(s);
}
}
class Temp40
{
int sal;
void show(int sal)
{
 if(sal<0)
 {
 throw new SalaryException("Negative Salary");
  
 }
else
{
this.sal=sal;
}
}

 void print(int sal)
 {
  show(sal);
   }

    void display(int sal)
    {
     print(sal);
    }
public static void main(String... a)
{
  Temp40 t1=new Temp40();
  try
  {
   t1.display(-15);
   }
  catch(SalaryException e)
  {
   e.printStackTrace();
  }
   System.out.print("after");
}
 
}
