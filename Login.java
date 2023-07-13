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
   public class Login   {
   ResultSet re;
   Statement ss; 
   long Account_No;
   String ide,passward,sql;
   String id,pass;
   Scanner s= new Scanner(System.in);
   public Login(){
       try{
           DriverManager.registerDriver(new  oracle.jdbc.OracleDriver());
           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Rajneesh","kd");
            ss = con.createStatement();
            
            
       }
       catch(SQLException e){
           System.err.println("ERROR");
           System.out.println(e);
       }
       
   }
  

  
     public void Login(){
         try
         {
        System.out.println(" Enter A Login ID ");
        ide=s.next();
        System.out.println(" Enter A Login Passward ");
        passward=s.next();
         System.out.println(" Enter A Account NO ");
        Account_No=s.nextLong();
        
      
       sql="select User_id,User_Pass from User_Data where Account_no='"+Account_No+"'";
       re=ss.executeQuery(sql);
       re.next();
      id= re.getString(1);
      pass= re.getString(2);
 
         check_login();
         }
        catch(Exception e){
             System.err.println("ERROR");
            System.out.println(" Invalid Id & Passward"+e);
            Login();
         }
        
    }
    void check_login(){
       try{ 
            
           if(ide.equals(id)&& passward.equals(pass)){
            System.out.println("Login Successfully");
            System.out.println("---------------------------------------------");
        }
        else
        {
             System.err.println("ERROR");
           System.out.println("Invalid Id , Passward & Account No.");
           System.out.println("Try Again");
           Login();  
        }
              
    }
    catch(Exception e){
         System.err.println("ERROR");
            System.out.println(e);
    }
    }


   
}
