import java.util.*;
class Square
{
int length,width;
float area()
{
return length*length;
}
void getdata(int l)
{
length=l;;
}
public static void main(String args[])
{
System.out.println("Program to calculate area of Square");
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number");
int a=sc.nextInt();
Square r=new Square();
r.getdata(a);
System.out.println(r.area());
}
}
