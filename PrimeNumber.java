import java.util.Scanner;
class PrimeNumber {
public static void main(String[]args)
{
Scanner scn=new Scanner(System.in);
System.out.println("enter a number");
int n=scn.nextInt();
boolean flag=true;
if (n<=1)
{
System.out.println("is not a Prime Number");
return;
}
if(int i=2;i<=n/2;i++) {
  if(n%i==0)
{
 flag=false;
  break;
  }
         }
         if (flag) {
        	 System.out.println("is a Prime number");
        	 
         }
         else {
        	 System.out.println("is not a prime number");
         }
	}

}
