import java.util.*;

public class MyClass {
  public static void main(String[] args) {
    String st,i1,i2,state1="",z1="",z2="";
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of states :");
    int s=sc.nextInt();
    sc.nextLine();
    
    HashMap<String, HashMap<String,String>> state = new HashMap<String,HashMap<String,String>>();
   

    for(int i=0;i<s;i++)
    {
     HashMap<String, String> ip= new HashMap<String, String>();
    System.out.println("Enter state :");
    st=sc.nextLine();
    if(i==0){
     state1=st;
     }
    System.out.println("Enter transitions for state "+st);
    for(int j=0;j<2;j++)
    {
          if(j==0){
	i1="a";
	}
          else{
	i1="b";
}
          System.out.println("Enter transitions for input symbol "+i1+" :");
          i2=sc.nextLine();
           ip.put(i1,i2);
    }

   
   
   
    state.put(st, ip);
    }
    System.out.println("NFA");
    System.out.println(state);



   HashMap<String, HashMap<String,String>> dstate = new HashMap<String,HashMap<String,String>>();
   dstate.put(state1,state.get(state1));
   HashMap<String, String> ip1= state.get(state1);

   String tr1=ip1.get("a");
    String tr2=ip1.get("b");
    if(tr1.contains(","))
{
    String[] t11=tr1.split(",") ;
    for(String x: t11)
    {
	if(state.containsKey(x))
{
               HashMap<String, String> ip4= state.get(x);
              z1=z1.concat(ip4.get("a"));
              z1=z1.concat(",");
}
else
{
z1=z1.concat("");
}
    }
}
else
{
if(state.containsKey(tr1))
{

 HashMap<String, String> ip4= state.get(tr1);
              z1=z1.concat(ip4.get("a"));
}
else
{
z1=z1.concat("");
}
}
 if(tr2.contains(","))
{
    String[] t12=tr2.split(",") ;
    for(String x: t12)
    {
	if(state.containsKey(x))
{
               HashMap<String, String> ip4= state.get(x);
              z2=z2.concat(ip4.get("b"));
              z2=z2.concat(",");
}
else
{
z2=z2.concat("");
}
    }
}
else
{
if(state.containsKey(tr2))
{
 HashMap<String, String> ip4= state.get(tr2);
              z2=z2.concat(ip4.get("b"));
}
else
{
z2=z2.concat("");
}
}

   HashMap<String, String> ip3= new HashMap<String, String>();    
   ip3.put("a",z1);
   ip3.put("b",z2);
   dstate.put(tr1,ip3);

    
   
   
   System.out.println("DFA");
   System.out.println(dstate);




  }
}
