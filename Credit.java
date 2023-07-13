/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package online_banking_system;

import java.sql.*;
import java.util.Scanner;


/**
 *
 * @author Krishnadeep Yadav
 */
public class Credit {
   ResultSet re;
   Statement ss; 
   long Account_No,total,totalall;
   String name,logid,ifsc,sql,sql1;
   Scanner s= new Scanner (System.in);

    public Credit() {
          try
          {
           DriverManager.registerDriver(new  oracle.jdbc.OracleDriver());
           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Rajneesh","kd");
            ss = con.createStatement();
            
            
       }
       catch(SQLException e)
       {
           System.err.println("ERROR");
           System.out.println(e);
       }
    }
    void creadit(){
        try{
        System.out.println("Enter a Account no");
        Account_No=s.nextLong();
  
        System.out.println("Enter Money");
        total=s.nextLong();
        sql="select Total_Balance from User_Data where Account_no='"+Account_No+"'";
         re=ss.executeQuery(sql);
         re.next();
         totalall = re.getLong(1);
         System.out.println("Your Balance is -> "+totalall);
         System.out.println("You Add Money is -> "+total);
        sql="Update User_Data SET Total_Balance=Total_Balance +"+total+" where Account_No='"+Account_No+"'";
     
        ss.executeQuery(sql);
        sql="select Total_Balance from User_Data where Account_no='"+Account_No+"'";
         re=ss.executeQuery(sql);
         re.next();
         totalall = re.getLong(1);
         System.out.println(" Your Total Balance Is -> "+totalall);
         sql="commit";
         ss.executeQuery(sql);
        
        }
        catch(Exception e)
        {
             System.err.println("ERROR");
            System.out.println(e);
        }  
    }
    void debit(){
        try{
        System.out.println("Enter a Account no");
        Account_No=s.nextLong();
        System.out.println("Enter a IFSC code");
        ifsc=s.next();
         System.out.println("Enter a Name");
        name=s.next();
        System.out.println("Enter a ID");
        logid=s.next();
  
        System.out.println("Enter Money");
        total=s.nextLong();
         sql="select Total_Balance from User_Data where Account_no='"+Account_No+"'";
         re=ss.executeQuery(sql);
         re.next();
         totalall = re.getLong(1);
         System.out.println("Your Balance is -> "+totalall);
         System.out.println("You Debit Money is -> "+total);
        sql1="Update User_Data SET Total_Balance= Total_Balance-'"+total+"' where Account_No='"+Account_No+"'and User_Name='"+name+"'and IFSC_CODE='"+ifsc+"'and User_id='"+logid+"'";
       // System.out.println(sql1);
         ss.executeQuery(sql1);
        sql="select Total_Balance from User_Data where Account_no='"+Account_No+"'";
         re=ss.executeQuery(sql);
         re.next();
         totalall = re.getLong(1);
         System.out.println(" Your Total Balance Is -> "+totalall);
         sql="commit";
         ss.executeQuery(sql);
        }
        catch(Exception e)
        {
            System.out.println("Error "+e);
        }  
    }  
}
   
    