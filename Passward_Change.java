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
public class Passward_Change  extends Login
{

    
    
     
    
    Scanner s= new Scanner (System.in);
    String ide1,passward1,sql1;
    long Account_No;
   public Passward_Change(){
     
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
  
       
      
  
    void old_pass() {
        try{
              Login();
          
        System.out.println("Enter A Old ID ");
        ide=s.next();
        System.out.println("Enter A Old Passward");
        passward=s.next(); 
        if(ide.equals(id)&& passward.equals(pass))
        new_pass();
        else{
            System.out.println("Enter A Correct Old Pass");
        old_pass();}
    }
     catch(Exception e){
          System.err.println("ERROR");
            System.out.println(e);
    }}
    
    void new_pass(){
        try{
            System.out.println("Enter a Account No");
             Account_No=s.nextLong();
            
         System.out.println("Enter A New ID ");
         id=s.next();
         
         System.out.println("Enter A New Passward ");
         pass=s.next();
         sql="Update User_Data SET User_id='"+id+"',User_pass='"+pass+"'where Account_No='"+Account_No+"'";
        // System.out.println(sql);
          ss.executeQuery(sql);
         System.out.println("Your ID & Passward Change Succesfully");
         sql="commit";
         ss.executeQuery(sql);
         
        }
         catch(Exception e){
              System.err.println("ERROR");
            System.err.println(" Account no is not valid " +e);
            new_pass();
         }}
  
}
