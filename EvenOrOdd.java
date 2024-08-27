import java.util.Scanner;
class EvenOrOdd
{
public static void main(String[]args)
{
Scanner scn=new Scanner(System.in);
System.out.println("enter a number");
int n=scn.nextInt();
if ((n&1)==0)
{
System.out.println("Even");
}
else
{
System.out.println("Odd");
}
}
}