class temp
{
void show(int a)
{
}                        // here show error beacz at the compile time only use signature & here both are same 
int show(int a)
{                        //aso there give ambiguity error
return 10;
}
public static void main(String args[])
{
temp t1=new temp();
t1.show(10);
}}j