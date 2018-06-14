class emp2
{
String name;
int salary;

void getvalue(String S1, int S2)
{
name=S1;
salary=S2;                              // put value hm run k lie means output lane k lie use krte h
}                                        //yha p phle e1 ka add dia fr e2 ka dia but wha add chng ho jayga dono jgh heap m 2000 aa jayga

void putvalue()
{
System.out.print(name);
System.out.print(salary);
}                            

public static void main(String args[])
{
emp2 e1=new emp2();
e1.getvalue("lalu",21);
emp2 e2=new emp2();
e2=e1;
e2.getvalue("bhalu",22);  


e1.putvalue();
e2.putvalue();                   
}
} 