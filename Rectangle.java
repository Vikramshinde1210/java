import java.util.*;
class Rectangle
{
int length,width;
float area()
{
return length*width;
}
void getdata(int l,int w)
{
length=l;
width=w;
}
public static void main(String args[])
{
System.out.println("Program to calculate area of rectangle");
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st number");
int a=sc.nextInt();
System.out.println("Enter 1st number");
int b=sc.nextInt();
Rectangle r=new Rectangle();
r.getdata(a,b);
System.out.println(r.area());
}
}


