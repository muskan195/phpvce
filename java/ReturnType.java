class ReturnType
{
void show(int a)
{                //error..because at compile time user only chk signature & there is show(int a) both same.........threre come am
}
int show(int a)
{
return 10;
}
public static void main(String... a)
{
ReturnType t1=new ReturnType();
t1.show();
}
}