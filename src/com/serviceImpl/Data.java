package com.serviceImpl;
import java.sql.*;
import java.util.*;
import com.services.*;

public class Data implements Requirement
 {
	Scanner sc =  new Scanner(System.in);
	public  void createTable() throws Exception 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/b177","root","rootroot");
		String sql = "create table Student(srno int,name varchar(20),mobno int,address varchar(30))";
		Statement stmt = con.createStatement();
		stmt.execute(sql);
		stmt.close();
		con.close();
		System.out.println("table created");

  }
	public void insertData() throws Exception 
	{
		System.out.println("Enter srno of student");
		int srno = sc.nextInt();
		System.out.println("Enter Student name");
		String name = sc.next();
		System.out.println("Enter mobile  no");
		long mobno = sc.nextLong();
		System.out.println("Enter student Address");
		String addr = sc.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/b177","root","rootroot");
		String sql = "insert into Student value('"+srno+"','"+name+"','"+mobno+"','"+addr+"')";
		Statement stmt = con.createStatement();
		stmt.execute(sql);
		stmt.close();    
		con.close();
		System.out.println("data inserted");
	}
	public void viewSingleData()  throws Exception 
	{
		System.out.println("Enter srno of student");
		int srno = sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/b177","root","rootroot");
		String sql = "select * from Student where srno ='"+srno+"'";
		Statement stmt = con.createStatement();
		stmt.execute(sql);
		ResultSet rs = stmt.executeQuery(sql);
		System.out.println("srno     " +"name      "+"mobno    "+"address" );
		if(rs.next())
			System.out.println(rs.getInt(1)+""+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
		stmt.close();
		con.close();
		
	}
	public void viewAllData()throws Exception 
 	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/b177","root","rootroot");
		String sql = "select * from Student";
		Statement stmt = con.createStatement();
//		stmt.execute(sql);
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next())
			{
				System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"    "+rs.getInt(3)+"    "+rs.getString(4));
		
			}
		stmt.close();
		con.close();
		
	}
	public void updateData()throws Exception
	{	
		System.out.println("Enter srno of student");
		int srno = sc.nextInt();
		System.out.println("Enter name to upade ");
		String name = sc.next();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/b177","root","rootroot");
		String sql = "update Student set name = '"+name+"' where srno='"+srno+"'";
		Statement stmt = con.createStatement();
		stmt.execute(sql);
		stmt.close();
		con.close();
		System.out.println("data updated succesfully");
	}
	public void deleteSingleData() throws Exception
	{
		System.out.println("Enter srno of student");
		int srno = sc.nextInt();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/b177","root","rootroot");
		String sql = "delete from student where srno ='"+srno+"'";
		Statement stmt = con.createStatement();
		stmt.execute(sql);
		stmt.close();
		con.close();
		System.out.println("data delete succesfully");
	}
	public void deleteAllData() throws Exception
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/b177","root","rootroot");
		String sql = "delete from student";
		Statement stmt = con.createStatement();
		stmt.execute(sql);
		stmt.close();
		con.close();
		System.out.println("data fdelete succesfully");	
	}
	public void deleteData() throws Exception
	
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/b177","root","rootroot");
		String sql = "drop table student ";
		Statement stmt = con.createStatement();
		stmt.execute(sql);
		stmt.close();
		con.close();
		System.out.println("data delete succesfully");	
	}
}
