abstract class Doctor
{
abstract void treatment();
void show()
{
}
void display()
{
}}
class Physician extends Doctor
{
void treatment()
{
}
public static void main(String... a)
{
Doctor d=new Physician();
d.treatment();
}
}
