import java.util.Scanner;
import java.io.*;
public class numbers 
{
public static void main(String args[])
{
int a,b,c;
Scanner sc = new Scanner(System.in);
System.out.println("Enter value of a");
a=sc.nextInt();
System.out.println("Enter value of b");
b=sc.nextInt();
System.out.println("Enter value of c");
c=sc.nextInt();
if(a>b && a>c)
System.out.println("A is greater no");
else if(b>a && b>c)
System.out.println("B is greater no");
else
System.out.println("C is greater no");


}
}
