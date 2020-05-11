import java.util.*;
class emp
{
String name;
int id;
emp(int d,String nm)
{
id=d;
name=nm;
}
void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter name of employee");
name=sc.nextLine();
System.out.println("Enter id of employee");
id=sc.nextInt();
}
void dis()
{
System.out.println("Name of employee"+name);
System.out.println("Id of employee"+id);
}
public static void main(String args[])
{
emp e=new emp(1,"vikram");
e.dis();

}
}
