import java.io.*;
import java.util.*;

class producer extends Thread{
public void run()
{
for(int i=0;i<4;i++)
{
System.out.println("Producer produces "+i);
}
System.out.println("Producer finished");
}
}
class consumer extends Thread{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("Consumer  consumes "+i);
}
System.out.println("Consumer finished");
}
}
class ProdCons{
public static void main(String args[])
{
try{
producer p=new producer();
consumer c=new consumer();
p.start();
c.start();
p.join();
c.join();
}
catch(Exception e)
{
System.out.println(e);
}
}
}
