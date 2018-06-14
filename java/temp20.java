class temp20
{
temp20()
{
temp20(10);
}
temp20(int a)
{
}
void temp20(int a)             //there occur ambiguity error
{
}
public static void main(String args[])
{
temp20 t1=new temp20();
//t1.show();
}}