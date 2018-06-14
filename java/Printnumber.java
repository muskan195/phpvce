import java.util.Scanner;

class Printnumber
{
public static void main(String... a)
{
 Scanner s= new Scanner(System.in);
int num=0;
int sum=0;

System.out.print("enter the numbers");
num= s.nextInt();

System.out.print("summ of all digits");
while(num>0)
{
System.out.print("-->" + num%10);
sum +=num % 10;
num=num / 10;
}
System.out.print("sum is" + sum);
}
}