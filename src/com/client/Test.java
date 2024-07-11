
	package com.client;

	import java.util.*;
	import com.serviceImpl.*;
	import com.services.*;

	public class Test {

	    public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        Data d = new Data();
	        int choice;
	        
	            
	            
	          loop:  while(true)
	            {
	        	  System.out.println("---select----\n1:createTable\n2:insertData\n3:viewSingleData\n4:viewAllData\n5:updateData\n6:deleteAllData\n7:deleteSingleData\n8:deleteData\n0:Exit");
		            System.out.print("Enter your choice: ");
		            choice = sc.nextInt();
	            switch (choice) {
	                case 1:
	                    d.createTable();
	                    break;
	                case 2:
	                    d.insertData();
	                    break;
	                case 3:
	                    d.viewSingleData();
	                    break;
	                case 4:
	                    d.viewAllData();
	                    break;
	                case 5:
	                    d.updateData();
	                    break;
	                case 6:
	                    d.deleteAllData();
	                    break;
	                case 7:
	                    d.deleteSingleData();
	                    break;
	                case 8:
	                    d.deleteData();
	                    break;
	                case 0:
	                    System.out.println("Exiting...");
	                    break;
	                default:
	                    System.out.println("Invalid choice!");
	                    break loop;
	            }
	            }
	       
	       
	    }
	}
	  