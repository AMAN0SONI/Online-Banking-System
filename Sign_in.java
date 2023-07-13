/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online_banking_system;
import java.util.Scanner;
import java.sql.*;
/**
 *
 * @author Krishnadeep Yadav
 */
public class Sign_in {
    Statement s1;
    ResultSet r;
    Scanner s= new Scanner (System.in);
    String ifsc,name,id,pass,sql;
    long account_no,balance=0;
     public Sign_in()
     {
       try
       {
           DriverManager.registerDriver(new  oracle.jdbc.OracleDriver());
           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Rajneesh","kd");
            s1 = con.createStatement();
            
       }
       catch(SQLException e)
       {
            System.err.println("ERROR");
           System.out.println(e);
       }
       
   }
     void Signin(){
         try{
             System.out.println("-----WELCOME FOE NEW REGISTERATION-----");
             System.out.println("---------------------------------------");
         System.out.println("Enter A Account no "+ "       Length Should be 10");
         account_no=s.nextLong();
     
         System.out.println("Enter A IFSC Code"+ "         Length Should be 10");
         ifsc=s.next();
         
         System.out.println("Enter A  Name" + "            Length Should be 15");
         name=s.next();
         System.out.println("Enter A  Login Id" + "        Length Should be 10");
         id=s.next();
         System.out.println("Enter A Login Passward"+ "    Length Should be 10");
         pass=s.next();
        
         
         sql="insert into User_Data values('"+account_no+"','"+ifsc+"','"+name+"','"+id+"','"+pass+"','"+balance+"')";
         s1.executeQuery(sql);
         sql="commit";
         s1.executeQuery(sql);
         System.out.println("------CONGRATULATION---------");
         System.out.println("YOUR ACCOUNT IS HAS BEEN OPENED IN THIS ACCOUNT ");
         }
         catch(Exception e)
         {
             
             System.err.println(" Error Length should be by the  given condition ");
         }   
     }      
     }
    

