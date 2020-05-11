

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class CE3 {
	
    public void display(Statement st)
    {
    	try
    	{
    	ResultSet r=st.executeQuery("select * from student");
            System.out.println("Name	     RollNo	  Division");	
    	while(r.next()) {
        	System.out.println(r.getString(1)+"		 "+r.getInt(2)+"	    "+r.getString(3));
        }
    	}
    	catch(SQLException e)
    	{
    		System.out.println(e);
    	}
    }
    public void delete(Connection co)
    {
    	try
    	{
    		PreparedStatement ps=null;
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter RollNo of Student to delete");
    	    int roll=sc.nextInt();
    		String query="delete from student where rollno=?";
    		ps=co.prepareStatement(query);
    		ps.setInt(1, roll);
    		sc.close();
    		ps.executeUpdate();
    		System.out.println("Record deleted");
        }
    	catch(SQLException e)
    	{
    		System.out.println(e);
    	}
    }
    public void drop(Connection co)
    {
    	try
    	{   
    		PreparedStatement ps=null;
    		String query="truncate table student";
    		ps=co.prepareStatement(query);
    		ps.executeUpdate();
        }
    	catch(SQLException e)
    	{
    		System.out.println(e);
    	}
    }
    public void update(Connection co)
    {
    	try
    	{
    		PreparedStatement ps=null;
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Enter RollNo of Student to update details");
    	    String roll=sc.nextLine();
    	    System.out.println("Enter Name of Student");
    	    String name=sc.nextLine();
    	    System.out.println("Enter Division of Student");
    	    String div=sc.nextLine();
    		String query="update student set name=?,division=? where rollno=?";
    		ps=co.prepareStatement(query);
    		ps.setString(1, name);
    		ps.setString(2, div);
    		ps.setString(3, roll);
    		ps.executeUpdate();
    		sc.close();
    		System.out.println("Record Updated");
        }
    	catch(SQLException e)
    	{
    		System.out.println(e);
    	}
    }
    public void insert(Connection co)
    {
    	try {
    		PreparedStatement ps=null;
    		Scanner sc=new Scanner(System.in);
    	    System.out.println("Enter Name of Student");
    	    String name=sc.nextLine();
    	    System.out.println("Enter Roll of Student");
    	    String roll=sc.nextLine();
    	    System.out.println("Enter Division of Student");
    	    String div=sc.nextLine();
    		String query="insert into student values(?,?,?)";
    		ps=co.prepareStatement(query);
    		ps.setString(1, name);
    		ps.setString(2, roll);
    		ps.setString(3, div);
            ps.executeUpdate();
            sc.close();
            System.out.println("Record inserted");
    	
    		
    		
    	}
    	catch(Exception e)
    	{
    		System.out.println(e);
    	}
    }
	public static void main(String args[])
	{
	try 
	{
	Class.forName("com.mysql.jdbc.Driver");
	System.out.println("Driver properly loaded");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
	System.out.println("Connection Established");
    Statement st=con.createStatement();
    CE3 c=new CE3();
    int ch;
    Scanner sc=new Scanner(System.in);
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    while(true)
    {
    	System.out.println("1.Insert Record");
    	System.out.println("6.Exit");
    	
    	System.out.println("Enter your choice:");
    	
    	ch=sc.nextInt();
    	
    	switch(ch)
    	{
    	case 1:
    		c.insert(con);
    		break;
    	case 6:
    		System.exit(0);
    		break;
    	}
    	
   
    }
    
    
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
	}

}
