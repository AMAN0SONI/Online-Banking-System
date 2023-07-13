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
public class Show_Detail {
    Statement s;
    ResultSet re;
     Scanner s1= new Scanner (System.in);
     long account_no,total;
     String sql,ifsc,name,id,pass;

    public Show_Detail() {
        try
          {
           DriverManager.registerDriver(new  oracle.jdbc.OracleDriver());
           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Rajneesh","kd");
            s = con.createStatement();
            
            
       }
       catch(SQLException e)
       {
            System.err.println("ERROR");
           System.out.println(e);
       }
    }
    void Show(){
        try{
        System.out.println(" Enter a Account No.");
        account_no=s1.nextLong();
        sql="select IFSC_Code,User_Name, User_id,User_Pass,Total_Balance from User_Data where Account_no='"+account_no+"'";
        re=s.executeQuery(sql);
        re.next();
        ifsc = re.getString(1);
        name= re.getString(2);
        id= re.getString(3);
        pass= re.getString(4);
        total= re.getLong(5);
        
        System.out.println(" ACCOUNT NO.    - "+account_no);
        System.out.println(" IFSC CODE      - "+ifsc);
        System.out.println(" NAME           - "+name);
        System.out.println(" LOGIN ID       - "+id);
        System.out.println(" LOGIN PASSWARD - "+pass);
        System.out.println(" TOTAL BALANCE  - "+total);
      
        }
        catch(Exception e){
             System.err.println("ERROR");
            System.out.println(e);
        }
        
        
    }
   
    
    
}
